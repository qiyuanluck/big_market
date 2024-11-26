package cn.project.domain.strategy.model.entity;

import cn.project.types.common.Constants;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: qiyuan
 * @Date: 2024/11/26 16:46
 * @Description: 策略规则实体
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StrategyRuleEntity {
    /**
     * 抽奖策略ID
     */
    private Long strategyId;
    /**
     * 抽奖奖品ID【规则类型为策略，则不需要奖品ID】
     */
    private Integer awardId;
    /**
     * 抽象规则类型；1-策略规则、2-奖品规则
     */
    private Integer ruleType;
    /**
     * 抽奖规则类型【rule_random - 随机值计算、rule_lock - 抽奖几次后解锁、rule_luck_award - 幸运奖(兜底奖品)】
     */
    private String ruleModel;
    /**
     * 抽奖规则比值
     */
    private String ruleValue;
    /**
     * 抽奖规则描述
     */
    private String ruleDesc;

    /**
     * 获取权重值
     * 案例： 4000:102,103,104,105 5000:102,103,104,105,106.....
     */
    public Map<String, List<Integer>> getRuleWeightValue(){
        if (!"rule_weight".equals(ruleModel)) return null;
        // 存放结果的map
        Map<String, List<Integer>> resultMap = new HashMap<>();
        // 把值通过空格分割 4000:102,103,104,105 5000:102,103,104,105，4000和5000分隔开
        String[] ruleValueGroups = ruleValue.split(Constants.SPACE);
        for (String ruleValueGroup : ruleValueGroups){
            //检查是否为空
            if (ruleValueGroup == null || ruleValueGroup.isEmpty()){
                return resultMap;
            }
            // 分割字符串获取键和值，通过冒号分割,4000:102,103,104,105分割成两个
            String[] parts = ruleValueGroup.split(Constants.COLON);
            if (parts.length != 2){
                throw new IllegalArgumentException("rule_weight rule_rule invalid input format" + ruleValueGroup);
            }
            // 解析值,102,103,104,105通过逗号分割
            String[] valueStrings = parts[1].split(Constants.SPLIT);
            List<Integer> values = new ArrayList<>();
            for (String valueString : valueStrings){
                values.add(Integer.parseInt(valueString));
            }
            resultMap.put(ruleValueGroup,values);
        }
        return resultMap;
    }
}
