package cn.project.trigger.api.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: qiyuan
 * @Date: 2024/12/22 14:09
 * @Description: 抽奖请求参数
 */
@Data
public class RaffleStrategyRequestDTO implements Serializable {

    // 抽奖策略ID
    private Long strategyId;

}
