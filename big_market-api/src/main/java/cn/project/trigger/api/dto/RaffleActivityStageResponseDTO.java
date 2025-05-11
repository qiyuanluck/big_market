package cn.project.trigger.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: qiyuan
 * @Date: 2025/05/11 18:30
 * @Description: 上架活动对象
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RaffleActivityStageResponseDTO {

    /** 自增ID */
    private Long id;
    /** 渠道 */
    private String channel;
    /** 来源 */
    private String source;
    /** 活动ID */
    private Long activityId;
    /** 上架状态；create、active、expire */
    private String state;

}
