package cn.project.trigger.api;

import cn.project.trigger.api.dto.ActivityDrawRequestDTO;
import cn.project.trigger.api.dto.ActivityDrawResponseDTO;
import cn.project.types.models.Response;

/**
 * @Author: qiyuan
 * @Date: 2025/02/26 16:54
 * @Description:  抽奖活动服务
 */
public interface IRaffleActivityService {

    /**
     * 活动装配，数据预热缓存
     * @param activityId 活动ID
     * @return 装配结果
     */
    Response<Boolean> armory(Long activityId);

    /**
     * 活动抽奖接口
     * @param request 请求对象
     * @return 返回结果
     */
    Response<ActivityDrawResponseDTO> draw(ActivityDrawRequestDTO request);

}
