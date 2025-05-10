package cn.project.infrastructure.dao;

import cn.bugstack.middleware.db.router.annotation.DBRouterStrategy;
import cn.project.infrastructure.dao.po.UserCreditOrder;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: qiyuan
 * @Date: 2025/05/08 15:23
 * @Description: 用户积分流水单 DAO
 */
@Mapper
@DBRouterStrategy(splitTable = true)
public interface IUserCreditOrderDao {

    void insert(UserCreditOrder userCreditOrderReq);

}
