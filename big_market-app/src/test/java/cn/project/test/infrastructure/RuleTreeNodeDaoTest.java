package cn.project.test.infrastructure;

import cn.project.infrastructure.persistent.dao.IRuleTreeNodeDao;
import cn.project.infrastructure.persistent.po.RuleTreeNode;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: qiyuan
 * @Date: 2025/02/28 14:06
 * @Description:
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class RuleTreeNodeDaoTest {

    @Resource
    private IRuleTreeNodeDao ruleTreeNodeDao;

    @Test
    public void test_queryRuleLocks() {
        List<RuleTreeNode> ruleTreeNodes = ruleTreeNodeDao.queryRuleLocks(new String[]{"tree_lock_1", "tree_lock_2"});
        log.info("测试结果:{}", JSON.toJSONString(ruleTreeNodes));
    }

}
