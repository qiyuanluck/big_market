package cn.project.infrastructure.dao;

import cn.bugstack.middleware.db.router.annotation.DBRouterStrategy;
import cn.project.infrastructure.dao.po.UserAwardRecord;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: qiyuan
 * @Date: 2025/02/22 14:06
 * @Description: 用户中奖记录表
 */
@Mapper
@DBRouterStrategy(splitTable = true)
public interface IUserAwardRecordDao {
    void insert(UserAwardRecord userAwardRecord);
    int updateAwardRecordCompletedState(UserAwardRecord userAwardRecordReq);
}
