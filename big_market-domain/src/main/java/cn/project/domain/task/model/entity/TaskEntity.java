package cn.project.domain.task.model.entity;

import lombok.Data;

/**
 * @Author: qiyuan
 * @Date: 2025/02/24 18:34
 * @Description: 任务实体对象
 */
@Data
public class TaskEntity {

    /** 活动ID */
    private String userId;
    /** 消息主题 */
    private String topic;
    /** 消息编号 */
    private String messageId;
    /** 消息主体 */
    private String message;

}
