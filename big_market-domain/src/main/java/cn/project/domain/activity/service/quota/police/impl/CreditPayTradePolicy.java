package cn.project.domain.activity.service.quota.police.impl;

import cn.project.domain.activity.model.aggregate.CreateQuotaOrderAggregate;
import cn.project.domain.activity.model.valobj.OrderStateVO;
import cn.project.domain.activity.adapter.repository.IActivityRepository;
import cn.project.domain.activity.service.quota.police.ITradePolicy;
import org.springframework.stereotype.Service;

/**
 * @Author: qiyuan
 * @Date: 2025/05/08 16:09
 * @Description: 积分兑换，支付类订单
 */
@Service("credit_pay_trade")
public class CreditPayTradePolicy implements ITradePolicy {

    private final IActivityRepository activityRepository;

    public CreditPayTradePolicy(IActivityRepository activityRepository) {
        this.activityRepository = activityRepository;
    }

    @Override
    public void trade(CreateQuotaOrderAggregate createQuotaOrderAggregate) {
        createQuotaOrderAggregate.setOrderState(OrderStateVO.wait_pay);
        activityRepository.doSaveCreditPayOrder(createQuotaOrderAggregate);
    }

}
