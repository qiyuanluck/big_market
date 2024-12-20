package cn.project.infrastructure.persistent.dao;

import cn.project.infrastructure.persistent.po.RuleTree;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: qiyuan
 * @Date: 2024/12/10 19:38
 * @Description: 规则树表DAO
 */
@Mapper
public interface IRuleTreeDao {

    RuleTree queryRuleTreeByTreeId(String treeId);
}