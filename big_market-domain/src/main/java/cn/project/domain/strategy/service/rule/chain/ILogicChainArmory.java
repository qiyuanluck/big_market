package cn.project.domain.strategy.service.rule.chain;

/**
 * @Author: qiyuan
 * @Date: 2024/12/09 17:08
 * @Description: 装配接口
 */
public interface ILogicChainArmory {

    ILogicChain next();

    ILogicChain appendNext(ILogicChain next);
}
