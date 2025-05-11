package cn.project.trigger.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author: qiyuan
 * @Date: 2025/05/11 17:09
 * @Description: 返利请求对象
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RebateRequestDTO implements Serializable {

    /**
     * 用户ID
     */
    private String userId;
    /**
     * 行为类型；sign 签到、openai_pay 支付
     */
    private String behaviorType;
    /**
     * 业务ID；签到则是日期字符串，支付则是外部的业务ID
     */
    private String outBusinessNo;

}
