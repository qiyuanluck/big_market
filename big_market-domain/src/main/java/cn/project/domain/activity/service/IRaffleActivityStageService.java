package cn.project.domain.activity.service;

import cn.project.domain.activity.model.entity.RaffleActivityStageEntity;

import java.util.List;

/**
 * @Author: qiyuan
 * @Date: 2025/05/11 18:43
 * @Description: 抽奖活动上架服务接口
 */
public interface IRaffleActivityStageService {
    /**
     * 添加上架活动
     *
     * @param channel    渠道
     * @param source     来源
     * @param activityId 活动ID
     */
    void appendStageActivity(String channel, String source, Long activityId);

    /**
     * 上架活动 - 将上架状态变更为有效
     *
     * @param id 上架流水ID
     * @return 活动ID
     */
    void updateStageActivity2Active(Long id);

    /**
     * 查询展台活动ID - 一个渠道&来源 sc 值下，只能有一个在线的活动。
     *
     * @param channel 渠道
     * @param source  来源
     * @return 活动ID
     */
    Long queryStageActivityId(String channel, String source);

    List<RaffleActivityStageEntity> queryStageActivityList();

    Long queryStageActivity2ActiveById(Long id);
}
