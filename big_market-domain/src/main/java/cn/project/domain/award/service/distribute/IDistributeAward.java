package cn.project.domain.award.service.distribute;

import cn.project.domain.award.model.entity.DistributeAwardEntity;

/**
 * @Author: qiyuan
 * @Date: 2025/05/08 14:30
 * @Description: 分发奖品接口
 */
public interface IDistributeAward {

    void giveOutPrizes(DistributeAwardEntity distributeAwardEntity);

}
