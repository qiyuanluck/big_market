package cn.project.domain.strategy.service.rule.chain.impl;

import cn.project.domain.strategy.service.armory.IStrategyDispatch;
import cn.project.domain.strategy.service.rule.chain.AbstractLogicChain;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @Author: qiyuan
 * @Date: 2024/12/09 15:47
 * @Description: 兜底
 */
@Slf4j
@Component("default")
public class DefaultLogicChain extends AbstractLogicChain {

    @Resource
    private IStrategyDispatch strategyDispatch;

    @Override
    public Integer logic(String userId, Long strategyId) {
        Integer awardId = strategyDispatch.getRandomAwardId(strategyId);
        log.info("抽奖责任链-默认处理 userId: {} strategyId: {} ruleModel: {} awardId: {}",userId,strategyId,ruleModel(),awardId);
        return awardId;
    }

    @Override
    protected String ruleModel() {
        return "default";
    }
}
