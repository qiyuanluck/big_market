package cn.project.domain.activity.service.quota.rule;

/**
 * @Author: qiyuan
 * @Date: 2025/02/19 15:15
 * @Description:
 */
public interface IActionChainArmory {

    IActionChain next();

    IActionChain appendNext(IActionChain next);

}
