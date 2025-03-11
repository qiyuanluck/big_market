package cn.project.domain.rebate.repository;

import cn.project.domain.rebate.model.aggregate.BehaviorRebateAggregate;
import cn.project.domain.rebate.model.entity.BehaviorRebateOrderEntity;
import cn.project.domain.rebate.model.valobj.BehaviorTypeVO;
import cn.project.domain.rebate.model.valobj.DailyBehaviorRebateVO;

import java.util.List;

/**
 * @Author: qiyuan
 * @Date: 2025/03/04 15:16
 * @Description: 行为返利服务仓储接口
 */
public interface IBehaviorRebateRepository {

    List<DailyBehaviorRebateVO> queryDailyBehaviorRebateConfig(BehaviorTypeVO behaviorTypeVO);

    void saveUserRebateRecord(String userId, List<BehaviorRebateAggregate> behaviorRebateAggregates);

    List<BehaviorRebateOrderEntity> queryOrderByOutBusinessNo(String userId, String outBusinessNo);

}
