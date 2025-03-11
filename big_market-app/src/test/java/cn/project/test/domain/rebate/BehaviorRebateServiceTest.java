package cn.project.test.domain.rebate;

import cn.project.domain.activity.service.armory.IActivityArmory;
import cn.project.domain.rebate.model.entity.BehaviorEntity;
import cn.project.domain.rebate.model.valobj.BehaviorTypeVO;
import cn.project.domain.rebate.service.IBehaviorRebateService;
import com.alibaba.fastjson2.JSON;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/**
 * @Author: qiyuan
 * @Date: 2025/03/04 15:32
 * @Description: 行为返利单测
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class BehaviorRebateServiceTest {

    @Resource
    private IBehaviorRebateService behaviorRebateService;

    @Resource
    private IActivityArmory activityArmory;

    @Before
    public void init() {
        activityArmory.assembleActivitySkuByActivityId(100301L);
    }

    @Test
    public void test_createOrder() throws InterruptedException {
        BehaviorEntity behaviorEntity = new BehaviorEntity();
        behaviorEntity.setUserId("qiyuan");
        behaviorEntity.setBehaviorTypeVO(BehaviorTypeVO.SIGN);
        // 重复的 OutBusinessNo 会报错唯一索引冲突，这也是保证幂等的手段，确保不会多记账
        behaviorEntity.setOutBusinessNo("20240503");

        List<String> orderIds = behaviorRebateService.createOrder(behaviorEntity);
        log.info("请求参数：{}", com.alibaba.fastjson2.JSON.toJSONString(behaviorEntity));
        log.info("测试结果：{}", JSON.toJSONString(orderIds));

        new CountDownLatch(1).await();
    }


}
