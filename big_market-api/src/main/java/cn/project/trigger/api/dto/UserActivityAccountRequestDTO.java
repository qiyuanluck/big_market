package cn.project.trigger.api.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: qiyuan
 * @Date: 2025/03/11 16:36
 * @Description: 用户活动账户请求对象
 */
@Data
public class UserActivityAccountRequestDTO implements Serializable {

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 活动ID
     */
    private Long activityId;

}
