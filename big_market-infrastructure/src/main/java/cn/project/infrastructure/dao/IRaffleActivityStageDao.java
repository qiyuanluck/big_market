package cn.project.infrastructure.dao;

import cn.project.infrastructure.dao.po.RaffleActivityStage;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: qiyuan
 * @Date: 2025/05/11 18:52
 * @Description:
 */
@Mapper
public interface IRaffleActivityStageDao {

    void insert(RaffleActivityStage raffleActivityStage);

    Integer updateStageActivity2ActiveById(Long id);

    Long queryStageActivity2ActiveById(Long id);

    Long queryStageActiveBySC(RaffleActivityStage raffleActivityStage);

    List<RaffleActivityStage> queryStageActivityList();

}
