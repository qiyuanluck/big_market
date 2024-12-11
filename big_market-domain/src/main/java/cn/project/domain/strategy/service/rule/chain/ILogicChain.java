package cn.project.domain.strategy.service.rule.chain;

import cn.project.domain.strategy.service.rule.chain.factory.DefaultChainFactory;

/**
 * @Author: qiyuan
 * @Date: 2024/12/09 15:37
 * @Description: 责任链接口
 */
public interface ILogicChain extends ILogicChainArmory{

    /**
     * 责任链接口
     * @param userId 用户id
     * @param strategyId 策略id
     * @return 奖品id
     */
    DefaultChainFactory.StrategyAwardVO logic(String userId, Long strategyId);

}
