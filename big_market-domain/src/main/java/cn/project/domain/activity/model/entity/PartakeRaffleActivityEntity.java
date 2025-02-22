package cn.project.domain.activity.model.entity;

import lombok.Data;

/**
 * @Author: qiyuan
 * @Date: 2025/02/22 15:50
 * @Description: 参与抽奖活动实体对象
 */
@Data
public class PartakeRaffleActivityEntity {

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 活动ID
     */
    private Long activityId;

}