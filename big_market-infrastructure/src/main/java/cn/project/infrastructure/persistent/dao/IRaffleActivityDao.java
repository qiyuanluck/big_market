package cn.project.infrastructure.persistent.dao;

import cn.project.infrastructure.persistent.po.RaffleActivity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: qiyuan
 * @Date: 2025/02/18 15:36
 * @Description: 抽奖活动表Dao
 */
@Mapper
public interface IRaffleActivityDao {

    RaffleActivity queryRaffleActivityByActivityId(Long activityId);

    Long queryStrategyIdByActivityId(Long activityId);

    Long queryActivityIdByStrategyId(Long strategyId);

}
