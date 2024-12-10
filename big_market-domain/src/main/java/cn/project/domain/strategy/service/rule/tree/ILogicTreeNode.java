package cn.project.domain.strategy.service.rule.tree;

import cn.project.domain.strategy.service.rule.tree.factory.DefaultTreeFactory;

/**
 * @Author: qiyuan
 * @Date: 2024/12/10 13:09
 * @Description: 规则树接口
 */
public interface ILogicTreeNode {

    DefaultTreeFactory.TreeActionEntity logic(String userId, Long strategyId, Integer awardId);

}
