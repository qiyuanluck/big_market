package cn.project.domain.activity.service.armory;

/**
 * @Author: qiyuan
 * @Date: 2025/02/20 15:06
 * @Description: 活动装配预热
 */
public interface IActivityArmory {


    boolean assembleActivitySkuByActivityId(Long activityId);

    boolean assembleActivitySku(Long sku);

}
