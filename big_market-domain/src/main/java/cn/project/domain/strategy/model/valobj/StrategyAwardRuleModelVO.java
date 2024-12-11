package cn.project.domain.strategy.model.valobj;

import cn.project.types.common.Constants;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: qiyuan
 * @Date: 2024/12/09 14:01
 * @Description: 抽奖策略规则规则值对象；值对象，没有唯一ID，仅限于从数据库查询对象
 */
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StrategyAwardRuleModelVO {
    private String ruleModels;
}
