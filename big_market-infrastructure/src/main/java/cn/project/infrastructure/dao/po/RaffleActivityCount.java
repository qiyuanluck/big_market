package cn.project.infrastructure.dao.po;

import lombok.Data;

import java.util.Date;

/**
 * @Author: qiyuan
 * @Date: 2025/02/18 14:34
 * @Description: 抽奖活动次数配置表 持久化对象
 */
@Data
public class RaffleActivityCount {

    /**
     * 自增ID
     */
    private Long id;

    /**
     * 活动次数编号
     */
    private Long activityCountId;

    /**
     * 总次数
     */
    private Integer totalCount;

    /**
     * 日次数
     */
    private Integer dayCount;

    /**
     * 月次数
     */
    private Integer monthCount;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

}


