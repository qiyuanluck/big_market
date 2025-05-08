package cn.project.domain.activity.service.quota.police.impl;

import cn.project.domain.activity.model.aggregate.CreateQuotaOrderAggregate;
import cn.project.domain.activity.model.valobj.OrderStateVO;
import cn.project.domain.activity.repository.IActivityRepository;
import cn.project.domain.activity.service.quota.police.ITradePolicy;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @Author: qiyuan
 * @Date: 2025/05/08 16:09
 * @Description:
 */
@Service("rebate_no_pay_trade")
public class RebateNoPayTradePolicy implements ITradePolicy {

    private final IActivityRepository activityRepository;

    public RebateNoPayTradePolicy(IActivityRepository activityRepository) {
        this.activityRepository = activityRepository;
    }

    @Override
    public void trade(CreateQuotaOrderAggregate createQuotaOrderAggregate) {
        // 不需要支付则修改订单金额为0，状态为完成，直接给用户账户充值
        createQuotaOrderAggregate.setOrderState(OrderStateVO.completed);
        createQuotaOrderAggregate.getActivityOrderEntity().setPayAmount(BigDecimal.ZERO);
        activityRepository.doSaveNoPayOrder(createQuotaOrderAggregate);
    }

}