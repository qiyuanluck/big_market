package cn.project.domain.strategy.service.rule.impl;

import cn.project.domain.strategy.model.entity.RuleActionEntity;
import cn.project.domain.strategy.model.entity.RuleMatterEntity;
import cn.project.domain.strategy.model.vo.RuleLogicCheckTypeVO;
import cn.project.domain.strategy.repository.IStrategyRepository;
import cn.project.domain.strategy.service.annotation.LogicStrategy;
import cn.project.domain.strategy.service.rule.ILogicFilter;
import cn.project.domain.strategy.service.rule.factory.DefaultLogicFactory;
import cn.project.types.common.Constants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.*;

/**
 * @Author: qiyuan
 * @Date: 2024/11/27 15:10
 * @Description: 【抽奖前规则】根据抽奖权重返回可抽奖范围KEY
 */
@Slf4j
@Component
@LogicStrategy(logicMode = DefaultLogicFactory.LogicModel.RULE_WIGHT)
public class RuleWeightLogicFilter implements ILogicFilter<RuleActionEntity.RaffleBeforeEntity> {

    @Resource
    private IStrategyRepository repository;

    public Long userScore = 4500L;

    @Override
    public RuleActionEntity<RuleActionEntity.RaffleBeforeEntity> filter(RuleMatterEntity ruleMatterEntity) {
        log.info("规则过滤-权重范围 userId:{} strategyId:{} ruleModel:{}", ruleMatterEntity.getUserId(), ruleMatterEntity.getStrategyId(), ruleMatterEntity.getRuleModel());

        String userId = ruleMatterEntity.getUserId();
        Long strategyId = ruleMatterEntity.getStrategyId();
        String ruleValue = repository.queryStrategyRuleValue(ruleMatterEntity.getStrategyId(), ruleMatterEntity.getAwardId(), ruleMatterEntity.getRuleModel());

        // 1.通过用户id查找用户抽奖消耗的总积分，测试时使用固定值
        Map<Long, String> analyticalValueGroup = getAnalyticalValue(ruleValue);
        if (null == analyticalValueGroup  || analyticalValueGroup .isEmpty()) {
            return RuleActionEntity.<RuleActionEntity.RaffleBeforeEntity>builder()
                    .code(RuleLogicCheckTypeVO.ALLOW.getCode())
                    .info(RuleLogicCheckTypeVO.ALLOW.getInfo())
                    .build();
        }

        // 2. 转换keys值，并默认排序
        List<Long> analyticalSortedKeys = new ArrayList<>(analyticalValueGroup .keySet());
        Collections.sort(analyticalSortedKeys);

        // 3. 找出最小符合的值，比如 4500 积分能找到对应的4000:102,103....不能找到5000:102,103...
        Long nextValue = analyticalSortedKeys.stream().filter(key -> userScore >= key)
                .findFirst()
                .orElse(null);

        // 4. 不为空则进行接管，为空直接放行
        if (null != nextValue) {
            return RuleActionEntity.<RuleActionEntity.RaffleBeforeEntity>builder()
                    .data(RuleActionEntity.RaffleBeforeEntity.builder()
                            .strategyId(strategyId)
                            .ruleWeightValueKey(analyticalValueGroup.get(nextValue))
                            .build())
                    .ruleModel(DefaultLogicFactory.LogicModel.RULE_WIGHT.getCode())
                    .code(RuleLogicCheckTypeVO.TAKE_OVER.getCode())
                    .info(RuleLogicCheckTypeVO.TAKE_OVER.getInfo())
                    .build();

        }

        return RuleActionEntity.<RuleActionEntity.RaffleBeforeEntity>builder()
                .code(RuleLogicCheckTypeVO.ALLOW.getCode())
                .info(RuleLogicCheckTypeVO.ALLOW.getInfo())
                .build();
    }


    private Map<Long, String> getAnalyticalValue(String ruleValue) {
        String[] ruleValueGroups = ruleValue.split(Constants.SPACE);
        Map<Long, String> ruleValueMap = new HashMap<>();
        for (String ruleValueKey : ruleValueGroups) {
            // 检查输入是否为空
            if (ruleValueKey == null || ruleValueKey.isEmpty()) {
                return ruleValueMap;
            }
            // 分割字符串以获取键和值
            String[] parts = ruleValueKey.split(Constants.COLON);
            if (parts.length != 2) {
                throw new IllegalArgumentException("rule_weight rule_rule invalid input format" + ruleValueKey);
            }
            ruleValueMap.put(Long.parseLong(parts[0]), ruleValueKey);
        }
        return ruleValueMap;
    }
}
