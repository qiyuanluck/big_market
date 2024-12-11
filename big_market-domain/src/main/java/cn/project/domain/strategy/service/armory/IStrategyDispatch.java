package cn.project.domain.strategy.service.armory;

/**
 * @Author: qiyuan
 * @Date: 2024/11/26 16:17
 * @Description: 策略抽奖调度
 */
public interface IStrategyDispatch {

    /**
     * 获取抽奖策略装配的随机结果
     *
     * @param strategyId 策略ID
     * @return 抽奖结果
     */
    Integer getRandomAwardId(Long strategyId);

    Integer getRandomAwardId(Long strategyId,String ruleWeightValue);

    Integer getRandomAwardId(String key);
}
