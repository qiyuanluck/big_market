package cn.project.domain.activity.service.quota.rule;

import cn.project.domain.activity.model.entity.ActivityCountEntity;
import cn.project.domain.activity.model.entity.ActivityEntity;
import cn.project.domain.activity.model.entity.ActivitySkuEntity;

/**
 * @Author: qiyuan
 * @Date: 2025/02/19 15:14
 * @Description: 下单规则过滤接口
 */
public interface IActionChain extends IActionChainArmory {

    boolean action(ActivitySkuEntity activitySkuEntity, ActivityEntity activityEntity, ActivityCountEntity activityCountEntity);

}
