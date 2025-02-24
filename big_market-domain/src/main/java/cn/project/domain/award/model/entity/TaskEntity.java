package cn.project.domain.award.model.entity;

import cn.project.domain.award.event.SendAwardMessageEvent;
import cn.project.domain.award.model.valobj.TaskStateVO;
import cn.project.types.event.BaseEvent;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;

/**
 * @Author: qiyuan
 * @Date: 2025/02/24 18:01
 * @Description: 任务实体对象
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TaskEntity {

    /** 活动ID */
    private String userId;
    /** 消息主题 */
    private String topic;
    /** 消息编号 */
    private String messageId;
    /** 消息主体 */
    private BaseEvent.EventMessage<SendAwardMessageEvent.SendAwardMessage> message;
    /** 任务状态；create-创建、completed-完成、fail-失败 */
    private TaskStateVO state;

}
