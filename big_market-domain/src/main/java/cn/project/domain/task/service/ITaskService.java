package cn.project.domain.task.service;

import cn.project.domain.task.model.entity.TaskEntity;

import java.util.List;

/**
 * @Author: qiyuan
 * @Date: 2025/02/24 18:34
 * @Description: 消息任务服务接口
 */
public interface ITaskService {

    /**
     * 查询发送MQ失败和超时1分钟未发送的MQ
     *
     * @return 未发送的任务消息列表10条
     */
    List<TaskEntity> queryNoSendMessageTaskList();

    void sendMessage(TaskEntity taskEntity);

    void updateTaskSendMessageCompleted(String userId, String messageId);

    void updateTaskSendMessageFail(String userId, String messageId);

}
