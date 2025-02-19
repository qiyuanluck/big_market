package cn.project.domain.activity.service.rule;

/**
 * @Author: qiyuan
 * @Date: 2025/02/19 15:15
 * @Description: 下单规则责任链抽象类
 */
public abstract class AbstractActionChain implements IActionChain {

    private IActionChain next;

    @Override
    public IActionChain next() {
        return next;
    }

    @Override
    public IActionChain appendNext(IActionChain next) {
        this.next = next;
        return next;
    }

}
