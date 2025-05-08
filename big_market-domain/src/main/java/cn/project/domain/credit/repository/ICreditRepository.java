package cn.project.domain.credit.repository;

import cn.project.domain.credit.model.aggregate.TradeAggregate;
import cn.project.domain.credit.model.entity.CreditAccountEntity;

/**
 * @Author: qiyuan
 * @Date: 2025/05/08 15:20
 * @Description: 用户积分仓储
 */
public interface ICreditRepository {

    void saveUserCreditTradeOrder(TradeAggregate tradeAggregate);

    CreditAccountEntity queryUserCreditAccount(String userId);

}