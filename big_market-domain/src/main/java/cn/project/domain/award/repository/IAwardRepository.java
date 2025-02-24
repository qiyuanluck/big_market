package cn.project.domain.award.repository;

import cn.project.domain.award.model.aggregate.UserAwardRecordAggregate;

/**
 * @Author: qiyuan
 * @Date: 2025/02/24 18:07
 * @Description: 奖品仓储服务
 */
public interface IAwardRepository {

    void saveUserAwardRecord(UserAwardRecordAggregate userAwardRecordAggregate);

}