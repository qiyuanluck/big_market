package cn.project.trigger.api.dto;

import lombok.Data;

/**
 * @Author: qiyuan
 * @Date: 2025/03/11 16:36
 * @Description: 抽奖策略规则，权重配置，查询N次抽奖可解锁奖品范围，请求对象
 */
@Data
public class RaffleStrategyRuleWeightRequestDTO {

    // 用户ID
    private String userId;
    // 抽奖活动ID
    private Long activityId;

}
