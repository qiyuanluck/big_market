package cn.project.domain.strategy.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: qiyuan
 * @Date: 2024/11/26 16:34
 * @Description: 策略结果实体
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class AwardEntity {
    /** 用户ID */
    private String userId;
    /** 奖品ID */
    private Integer awardId;
}
