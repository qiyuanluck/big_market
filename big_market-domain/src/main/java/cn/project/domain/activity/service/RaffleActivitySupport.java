package cn.project.domain.activity.service;

import cn.project.domain.activity.model.entity.ActivityCountEntity;
import cn.project.domain.activity.model.entity.ActivityEntity;
import cn.project.domain.activity.model.entity.ActivitySkuEntity;
import cn.project.domain.activity.repository.IActivityRepository;
import cn.project.domain.activity.service.rule.factory.DefaultActivityChainFactory;

/**
 * @Author: qiyuan
 * @Date: 2025/02/19 15:17
 * @Description: 抽奖活动的支撑类
 */
public class RaffleActivitySupport {

    protected DefaultActivityChainFactory defaultActivityChainFactory;

    protected IActivityRepository activityRepository;

    public RaffleActivitySupport(IActivityRepository activityRepository, DefaultActivityChainFactory defaultActivityChainFactory) {
        this.activityRepository = activityRepository;
        this.defaultActivityChainFactory = defaultActivityChainFactory;
    }

    public ActivitySkuEntity queryActivitySku(Long sku) {
        return activityRepository.queryActivitySku(sku);
    }

    public ActivityEntity queryRaffleActivityByActivityId(Long activityId) {
        return activityRepository.queryRaffleActivityByActivityId(activityId);
    }

    public ActivityCountEntity queryRaffleActivityCountByActivityCountId(Long activityCountId) {
        return activityRepository.queryRaffleActivityCountByActivityCountId(activityCountId);
    }

}
