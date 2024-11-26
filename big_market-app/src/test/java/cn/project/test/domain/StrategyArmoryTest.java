package cn.project.test.domain;

import cn.project.domain.strategy.service.armory.IStrategyArmory;
import cn.project.domain.strategy.service.armory.IStrategyDispatch;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @Author: qiyuan
 * @Date: 2024/11/26 14:26
 * @Description:
 */
@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class StrategyArmoryTest {

    @Resource
    private IStrategyArmory strategyArmory;

    @Resource
    private IStrategyDispatch strategyDispatch;


    @Before
    public void test_strategyArmory(){
        boolean success = strategyArmory.assembleLotteryStrategy(100001L);
//        boolean success1 = strategyArmory.assembleLotteryStrategy(100002L);
//        boolean success2 = strategyArmory.assembleLotteryStrategy(100003L);

        log.info("测试结果:{}",success);
    }
    /**
     * 从装配的策略中随机获取奖品ID值
     */
    @Test
    public void test_getRandomAwardId() {
        log.info("测试结果：{} - 奖品ID值", strategyDispatch.getRandomAwardId(100001L));
//        log.info("测试结果：{} - 奖品ID值", strategyDispatch.getRandomAwardId(100002L));
//        log.info("测试结果：{} - 奖品ID值", strategyDispatch.getRandomAwardId(100003L));

    }

    /**
     * 根据策略ID+权重值，从装配的策略中随机获取奖品ID值
     * 亮点：可以控制多少积分可以抽取到什么奖品，怎么实现的
     */
    @Test
    public void test_getRandomAwardId_ruleWeightValue() {
        log.info("测试结果：{} - 4000 策略配置", strategyDispatch.getRandomAwardId(100001L, "4000:102,103,104,105"));
        log.info("测试结果：{} - 5000 策略配置", strategyDispatch.getRandomAwardId(100001L, "5000:102,103,104,105,106,107"));
        log.info("测试结果：{} - 6000 策略配置", strategyDispatch.getRandomAwardId(100001L, "6000:102,103,104,105,106,107,108,109"));
    }
}
