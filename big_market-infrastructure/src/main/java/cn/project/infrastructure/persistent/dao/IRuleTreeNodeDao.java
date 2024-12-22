package cn.project.infrastructure.persistent.dao;

import cn.project.infrastructure.persistent.po.RuleTreeNode;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: qiyuan
 * @Date: 2024/12/10 19:38
 * @Description: 规则树节点表DAO
 */
@Mapper
public interface IRuleTreeNodeDao {

    List<RuleTreeNode> queryRuleTreeNodeListByTreeId(String treeId);

}

