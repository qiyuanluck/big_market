package cn.project.infrastructure.persistent.dao;

import cn.project.infrastructure.persistent.po.Strategy;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: qiyuan
 * @Date: 2024/11/25 19:59
 * @Description: 抽奖策略
 */
@Mapper
public interface IStrategyDao {

    List<Strategy> queryStrategyList();

    Strategy queryStrategyByStrategyId(Long strategyId);

}
