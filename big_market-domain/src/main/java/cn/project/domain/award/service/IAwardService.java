package cn.project.domain.award.service;

import cn.project.domain.award.model.entity.UserAwardRecordEntity;

/**
 * @Author: qiyuan
 * @Date: 2025/02/24 18:00
 * @Description: 奖品服务接口
 */
public interface IAwardService {

    void saveUserAwardRecord(UserAwardRecordEntity userAwardRecordEntity);

}
