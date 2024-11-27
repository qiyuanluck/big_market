package cn.project.domain.strategy.model.entity;

import cn.project.domain.strategy.model.vo.RuleLogicCheckTypeVO;
import lombok.*;

/**
 * @Author: qiyuan
 * @Date: 2024/11/27 14:29
 * @Description: 规则动作实体,抽奖前抽奖中抽奖后返回的结果可能是有差异的
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class RuleActionEntity<T extends RuleActionEntity.RaffleEntity> {

    private String code = RuleLogicCheckTypeVO.ALLOW.getCode();
    private String info = RuleLogicCheckTypeVO.ALLOW.getInfo();
    private String ruleModel;
    private T data;


    static public class RaffleEntity{

    }

    // 抽奖前
    @EqualsAndHashCode(callSuper = true)
    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    static public class RaffleBeforeEntity extends RaffleEntity{
        /**
         * 策略ID
         */
        private Long strategyId;

        /**
         * 权重值Key；用于抽奖时可以选择权重抽奖。
         */
        private String ruleWeightValueKey;

        /**
         * 奖品ID；
         */
        private Integer awardId;
    }

    // 抽奖之中
    static public class RaffleCenterEntity extends RaffleEntity {

    }

    // 抽奖之后
    static public class RaffleAfterEntity extends RaffleEntity {

    }

}
