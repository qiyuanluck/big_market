package cn.project.domain.strategy.service.armory;

/**
 * @Author: qiyuan
 * @Date: 2024/11/26 10:50
 * @Description: 装配兵工厂，负责初始化策略计算
 */
public interface IStrategyArmory {

    boolean assembleLotteryStrategy(Long strategyId);

    Integer getRandomAwardId(Long strategyId);

}
