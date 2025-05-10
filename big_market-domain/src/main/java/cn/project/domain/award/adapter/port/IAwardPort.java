package cn.project.domain.award.adapter.port;

/**
 * @Author: qiyuan
 * @Date: 2025/05/10 20:50
 * @Description: 奖品对接接口
 */
public interface IAwardPort {

    void adjustAmount(String userId, Integer increaseQuota) throws Exception;

}
