package cn.project.domain.strategy.repository;

import cn.project.domain.strategy.model.entity.StrategyAwardEntity;
import cn.project.domain.strategy.model.entity.StrategyEntity;
import cn.project.domain.strategy.model.entity.StrategyRuleEntity;
import cn.project.domain.strategy.model.valobj.StrategyAwardRuleModelVO;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: qiyuan
 * @Date: 2024/11/26 10:53
 * @Description: 策略仓储接口
 */
public interface IStrategyRepository {

    List<StrategyAwardEntity> queryStrategyAwardList(Long strategyId);

    int getRateRange(Long strategyId);

    int getRateRange(String key);

    Integer getStrategyAwardAssemble(String key, int rateKey);

//    void storeStrategyAwardSearchRateTables(String key, Integer rateRange, HashMap<Integer, Integer> shuffleStrategyAwardSearchRateTables);

    StrategyRuleEntity queryStrategyRule(Long strategyId, String ruleModel);

    String queryStrategyRuleValue(Long strategyId, Integer awardId, String ruleModel);

    String queryStrategyRuleValue(Long strategyId, String ruleModel);


    StrategyEntity queryStrategyEntityByStrategyId(Long strategyId);

    StrategyAwardRuleModelVO queryStrategyAwardRuleModelVO(Long strategyId, Integer awardId);

    void storeStrategyAwardSearchRateTable(String key, Integer rateRange, Map<Integer, Integer> strategyAwardSearchRateTable);
}
