package cn.project.domain.strategy.service.rule.chain;

/**
 * @Author: qiyuan
 * @Date: 2024/12/09 15:41
 * @Description:
 */
public abstract class AbstractLogicChain implements ILogicChain{

    private ILogicChain next;

    @Override
    public ILogicChain appendNext(ILogicChain next) {
        this.next = next;
        return next;
    }

    @Override
    public ILogicChain next() {
        return next;
    }

    protected abstract String ruleModel();
}
