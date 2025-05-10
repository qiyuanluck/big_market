package cn.project.trigger.api.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: qiyuan
 * @Date: 2024/12/22 14:05
 * @Description: 抽奖奖品列表请求对象
 */
@Data
public class RaffleAwardListRequestDTO implements Serializable {

    // 用户ID
    private String userId;
    // 抽奖活动ID
    private Long activityId;

}
