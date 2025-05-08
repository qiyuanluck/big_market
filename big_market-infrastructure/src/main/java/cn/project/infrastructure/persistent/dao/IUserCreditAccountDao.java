package cn.project.infrastructure.persistent.dao;

import cn.project.infrastructure.persistent.po.UserCreditAccount;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: qiyuan
 * @Date: 2025/05/08 14:40
 * @Description: 用户积分账户
 */
@Mapper
public interface IUserCreditAccountDao {

    void insert(UserCreditAccount userCreditAccountReq);

    int updateAddAmount(UserCreditAccount userCreditAccountReq);

}

