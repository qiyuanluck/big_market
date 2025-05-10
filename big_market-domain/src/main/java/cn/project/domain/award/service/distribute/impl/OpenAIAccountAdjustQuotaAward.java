package cn.project.domain.award.service.distribute.impl;

import cn.project.domain.award.adapter.port.IAwardPort;
import cn.project.domain.award.adapter.repository.IAwardRepository;
import cn.project.domain.award.model.entity.DistributeAwardEntity;
import cn.project.domain.award.service.distribute.IDistributeAward;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @Author: qiyuan
 * @Date: 2025/05/10 21:54
 * @Description:
 */
@Component("openai_use_count")
public class OpenAIAccountAdjustQuotaAward implements IDistributeAward {

    @Resource
    private IAwardPort port;
    @Resource
    private IAwardRepository repository;

    @Override
    public void giveOutPrizes(DistributeAwardEntity distributeAwardEntity) throws Exception {
        // 奖品ID
        Integer awardId = distributeAwardEntity.getAwardId();
        // 查询奖品ID 「优先走透传的随机积分奖品配置」
        String awardConfig = distributeAwardEntity.getAwardConfig();
        if (StringUtils.isBlank(awardConfig)) {
            awardConfig = repository.queryAwardConfig(awardId);
        }
        // 发奖接口
        port.adjustAmount(distributeAwardEntity.getUserId(), Integer.valueOf(awardConfig));
    }

}
