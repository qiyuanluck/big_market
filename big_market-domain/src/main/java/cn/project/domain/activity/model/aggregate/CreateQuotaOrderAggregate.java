package cn.project.domain.activity.model.aggregate;

import cn.project.domain.activity.model.entity.ActivityOrderEntity;
import cn.project.domain.activity.model.valobj.OrderStateVO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: qiyuan
 * @Date: 2025/02/19 14:04
 * @Description: 下单聚合对象
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateQuotaOrderAggregate {

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 活动ID
     */
    private Long activityId;

    /**
     * 增加；总次数
     */
    private Integer totalCount;

    /**
     * 增加；日次数
     */
    private Integer dayCount;

    /**
     * 增加；月次数
     */
    private Integer monthCount;

    /**
     * 活动订单实体
     */
    private ActivityOrderEntity activityOrderEntity;

    public void setOrderState(OrderStateVO orderState) {
        this.activityOrderEntity.setState(orderState);
    }

}