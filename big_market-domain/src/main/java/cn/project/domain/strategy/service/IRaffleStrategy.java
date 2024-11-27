package cn.project.domain.strategy.service;

import cn.project.domain.strategy.model.entity.RaffleAwardEntity;
import cn.project.domain.strategy.model.entity.RaffleFactorEntity;

/**
 * @Author: qiyuan
 * @Date: 2024/11/27 14:13
 * @Description: 抽奖策略接口
 */
public interface IRaffleStrategy {

    RaffleAwardEntity performRaffle(RaffleFactorEntity raffleFactorEntity);

}
