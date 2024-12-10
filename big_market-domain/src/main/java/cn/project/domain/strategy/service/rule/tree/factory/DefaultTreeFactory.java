package cn.project.domain.strategy.service.rule.tree.factory;

import cn.project.domain.strategy.model.valobj.RuleLogicCheckTypeVO;
import cn.project.domain.strategy.model.valobj.RuleTreeVO;
import cn.project.domain.strategy.service.rule.tree.ILogicTreeNode;
import cn.project.domain.strategy.service.rule.tree.factory.engine.IDecisionTreeEngine;
import cn.project.domain.strategy.service.rule.tree.factory.engine.impl.DecisionTreeEngine;
import org.springframework.stereotype.Service;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;
/**
 * @Author: qiyuan
 * @Date: 2024/12/10 13:19
 * @Description: 规则树工厂
 */
@Service
public class DefaultTreeFactory {

    private final Map<String, ILogicTreeNode> logicTreeNodeGroup;

    public DefaultTreeFactory(Map<String, ILogicTreeNode> logicTreeNodeGroup) {
        this.logicTreeNodeGroup = logicTreeNodeGroup;
    }

    public IDecisionTreeEngine openLogicTree(RuleTreeVO ruleTreeVO){
        return new DecisionTreeEngine(logicTreeNodeGroup,ruleTreeVO);
    }

    /**
     * 决策树个动作实习
     */
    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class TreeActionEntity {
        private RuleLogicCheckTypeVO ruleLogicCheckType;
        private StrategyAwardData strategyAwardData;
    }



    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class StrategyAwardData {
        /** 抽奖奖品ID - 内部流转使用 */
        private Integer awardId;
        /** 抽奖奖品规则 */
        private String awardRuleValue;
    }


}
