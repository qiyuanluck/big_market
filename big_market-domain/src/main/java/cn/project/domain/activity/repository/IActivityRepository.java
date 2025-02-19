package cn.project.domain.activity.repository;

import cn.project.domain.activity.model.aggregate.CreateOrderAggregate;
import cn.project.domain.activity.model.entity.ActivityCountEntity;
import cn.project.domain.activity.model.entity.ActivityEntity;
import cn.project.domain.activity.model.entity.ActivitySkuEntity;

/**
 * @Author: qiyuan
 * @Date: 2025/02/19 14:13
 * @Description: 活动仓储接口
 */
public interface IActivityRepository {

    ActivitySkuEntity queryActivitySku(Long sku);

    ActivityEntity queryRaffleActivityByActivityId(Long activityId);

    ActivityCountEntity queryRaffleActivityCountByActivityCountId(Long activityCountId);

    void doSaveOrder(CreateOrderAggregate createOrderAggregate);
}
