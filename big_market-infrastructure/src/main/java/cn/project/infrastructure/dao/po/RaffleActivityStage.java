package cn.project.infrastructure.dao.po;

import lombok.Data;

import java.sql.Date;

/**
 * @Author: qiyuan
 * @Date: 2025/05/11 18:52
 * @Description:
 */
@Data
public class RaffleActivityStage {

    /** ID */
    private Long id;
    /** 渠道 */
    private String channel;
    /** 来源 */
    private String source;
    /** 活动ID */
    private Long activityId;
    /** 上架状态；create、active、expire */
    private String state;
    /** 创建时间 */
    private Date createTime;
    /** 更新时间 */
    private Date updateTime;

}
