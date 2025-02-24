package cn.project.domain.task.repository;

import cn.project.domain.task.model.entity.TaskEntity;

import java.util.List;

/**
 * @Author: qiyuan
 * @Date: 2025/02/24 18:34
 * @Description: 任务服务仓储接口
 */
public interface ITaskRepository {
    List<TaskEntity> queryNoSendMessageTaskList();

    void sendMessage(TaskEntity taskEntity);

    void updateTaskSendMessageCompleted(String userId, String messageId);

    void updateTaskSendMessageFail(String userId, String messageId);
}
