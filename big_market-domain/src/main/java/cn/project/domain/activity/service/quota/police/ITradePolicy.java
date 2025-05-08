package cn.project.domain.activity.service.quota.police;

import cn.project.domain.activity.model.aggregate.CreateQuotaOrderAggregate;

/**
 * @Author: qiyuan
 * @Date: 2025/05/08 16:08
 * @Description: 交易策略接口，包括；返利兑换（不用支付），积分订单（需要支付）
 */
public interface ITradePolicy {

    void trade(CreateQuotaOrderAggregate createQuotaOrderAggregate);

}
