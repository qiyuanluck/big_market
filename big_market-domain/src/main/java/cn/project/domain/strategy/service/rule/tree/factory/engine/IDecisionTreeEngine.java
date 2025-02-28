package cn.project.domain.strategy.service.rule.tree.factory.engine;

import cn.project.domain.strategy.service.rule.tree.factory.DefaultTreeFactory;

import java.util.Date;

/**
 * @Author: qiyuan
 * @Date: 2024/12/10 13:23
 * @Description: 规则树组合接口
 */
public interface IDecisionTreeEngine {

    DefaultTreeFactory.StrategyAwardVO process(String userId, Long strategyId, Integer awardId, Date endDateTime);

}
