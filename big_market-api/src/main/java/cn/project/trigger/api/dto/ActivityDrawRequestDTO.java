package cn.project.trigger.api.dto;

import lombok.Data;

/**
 * @Author: qiyuan
 * @Date: 2025/02/26 16:55
 * @Description: 活动抽奖请求对象
 */
@Data
public class ActivityDrawRequestDTO {

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 活动ID
     */
    private Long activityId;

}
