package cn.project.domain.strategy.service.rule;

import cn.project.domain.strategy.model.entity.RuleActionEntity;
import cn.project.domain.strategy.model.entity.RuleMatterEntity;

/**
 * @Author: qiyuan
 * @Date: 2024/11/27 14:23
 * @Description:  抽奖规则过滤接口
 */
public interface ILogicFilter<T extends RuleActionEntity.RaffleEntity> {

    RuleActionEntity<T> filter(RuleMatterEntity ruleMatterEntity);

}
