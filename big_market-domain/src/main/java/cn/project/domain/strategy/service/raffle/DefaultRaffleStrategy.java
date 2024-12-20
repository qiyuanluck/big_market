package cn.project.domain.strategy.service.raffle;

import cn.project.domain.strategy.model.entity.RaffleFactorEntity;
import cn.project.domain.strategy.model.entity.RuleActionEntity;
import cn.project.domain.strategy.model.entity.RuleMatterEntity;
import cn.project.domain.strategy.model.valobj.RuleLogicCheckTypeVO;
import cn.project.domain.strategy.model.valobj.RuleTreeVO;
import cn.project.domain.strategy.model.valobj.StrategyAwardRuleModelVO;
import cn.project.domain.strategy.model.valobj.StrategyAwardStockKeyVO;
import cn.project.domain.strategy.repository.IStrategyRepository;
import cn.project.domain.strategy.service.AbstractRaffleStrategy;
import cn.project.domain.strategy.service.armory.IStrategyDispatch;
import cn.project.domain.strategy.service.rule.chain.ILogicChain;
import cn.project.domain.strategy.service.rule.chain.factory.DefaultChainFactory;
import cn.project.domain.strategy.service.rule.tree.factory.DefaultTreeFactory;
import cn.project.domain.strategy.service.rule.tree.factory.engine.IDecisionTreeEngine;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Author: qiyuan
 * @Date: 2024/11/27 15:33
 * @Description:
 */
@Slf4j
@Service
public class DefaultRaffleStrategy extends AbstractRaffleStrategy {

    public DefaultRaffleStrategy(IStrategyRepository repository, IStrategyDispatch strategyDispatch, DefaultChainFactory defaultChainFactory, DefaultTreeFactory defaultTreeFactory) {
        super(repository, strategyDispatch, defaultChainFactory, defaultTreeFactory);
    }

    @Override
    public DefaultChainFactory.StrategyAwardVO raffleLogicChain(String userId, Long strategyId) {
        ILogicChain logicChain = defaultChainFactory.openLogicChain(strategyId);
        return logicChain.logic(userId, strategyId);
    }

    @Override
    public DefaultTreeFactory.StrategyAwardVO raffleLogicTree(String userId, Long strategyId, Integer awardId) {
        StrategyAwardRuleModelVO strategyAwardRuleModelVO = repository.queryStrategyAwardRuleModelVO(strategyId, awardId);
        if (null == strategyAwardRuleModelVO) {
            return DefaultTreeFactory.StrategyAwardVO.builder().awardId(awardId).build();
        }
        RuleTreeVO ruleTreeVO = repository.queryRuleTreeVOByTreeId(strategyAwardRuleModelVO.getRuleModels());
        if (null == ruleTreeVO) {
            throw new RuntimeException("存在抽奖策略配置的规则模型 Key，未在库表 rule_tree、rule_tree_node、rule_tree_line 配置对应的规则树信息 " + strategyAwardRuleModelVO.getRuleModels());
        }
        IDecisionTreeEngine treeEngine = defaultTreeFactory.openLogicTree(ruleTreeVO);
        return treeEngine.process(userId, strategyId, awardId);
    }

    @Override
    public StrategyAwardStockKeyVO takeQueueValue() throws InterruptedException {
        return repository.takeQueueValue();
    }

    @Override
    public void updateStrategyAwardStock(Long strategyId, Integer awardId) {
        repository.updateStrategyAwardStock(strategyId, awardId);
    }

}
