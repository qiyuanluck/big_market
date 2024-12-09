package cn.project.domain.strategy.model.entity;

import cn.project.types.common.Constants;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

/**
 * @Author: qiyuan
 * @Date: 2024/11/26 16:31
 * @Description: 策略实体
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StrategyEntity {

    /**
     * 抽奖策略ID
     */
    private Long strategyId;
    /**
     * 抽奖策略描述
     */
    private String strategyDesc;
    /**
     * 抽奖规则模型 rule_weight,rule_blacklist
     */
    private String ruleModels;

    public String[] ruleModels() {
        if (StringUtils.isBlank(ruleModels)) return null;
        return ruleModels.split(Constants.SPLIT);
    }

    public String getRuleWeight() {
        String[] ruleModels = this.ruleModels();
        if (null == ruleModels) { // 必须做判空处理
            return null;
        }
        for (String ruleModel : ruleModels) {
            if ("rule_weight".equals(ruleModel)) return ruleModel;
        }
        return null;
    }

}
