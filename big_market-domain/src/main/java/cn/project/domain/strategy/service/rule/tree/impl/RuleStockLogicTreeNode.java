package cn.project.domain.strategy.service.rule.tree.impl;

import cn.project.domain.strategy.model.valobj.RuleLogicCheckTypeVO;
import cn.project.domain.strategy.service.rule.tree.ILogicTreeNode;
import cn.project.domain.strategy.service.rule.tree.factory.DefaultTreeFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @Author: qiyuan
 * @Date: 2024/12/10 13:17
 * @Description: 库存节点
 */
@Slf4j
@Component("rule_stock")
public class RuleStockLogicTreeNode implements ILogicTreeNode {
    @Override
    public DefaultTreeFactory.TreeActionEntity logic(String userId, Long strategyId, Integer awardId) {
        return DefaultTreeFactory.TreeActionEntity.builder()
                .ruleLogicCheckType(RuleLogicCheckTypeVO.TAKE_OVER)
                .build();
    }
}
