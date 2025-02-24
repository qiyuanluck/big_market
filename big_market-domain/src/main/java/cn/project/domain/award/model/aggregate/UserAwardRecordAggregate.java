package cn.project.domain.award.model.aggregate;

import cn.project.domain.award.model.entity.TaskEntity;
import cn.project.domain.award.model.entity.UserAwardRecordEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;

/**
 * @Author: qiyuan
 * @Date: 2025/02/24 18:03
 * @Description: 用户中奖记录聚合对象 【聚合代表一个事务操作】
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserAwardRecordAggregate {

    private UserAwardRecordEntity userAwardRecordEntity;

    private TaskEntity taskEntity;

}
