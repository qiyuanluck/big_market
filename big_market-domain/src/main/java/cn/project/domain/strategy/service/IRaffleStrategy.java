package cn.project.domain.strategy.service;

import cn.project.domain.strategy.model.entity.RaffleAwardEntity;
import cn.project.domain.strategy.model.entity.RaffleFactorEntity;

/**
 * @Author: qiyuan
 * @Date: 2024/11/27 14:13
 * @Description: 抽奖策略接口
 */
public interface IRaffleStrategy {

    /**
     * 执行抽奖；用抽奖因子入参，执行抽奖计算，返回奖品信息
     *
     * @param raffleFactorEntity 抽奖因子实体对象，根据入参信息计算抽奖结果
     * @return 抽奖的奖品
     */
    RaffleAwardEntity performRaffle(RaffleFactorEntity raffleFactorEntity);

}
