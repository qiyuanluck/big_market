package cn.project.domain.strategy.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: qiyuan
 * @Date: 2024/11/27 14:15
 * @Description: 抽奖因子实体
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class RaffleFactorEntity {

    /** 用户ID */
    private String userId;
    /** 策略ID */
    private Long strategyId;

}
