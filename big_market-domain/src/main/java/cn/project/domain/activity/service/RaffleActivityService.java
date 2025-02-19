package cn.project.domain.activity.service;

import cn.project.domain.activity.repository.IActivityRepository;
import org.springframework.stereotype.Service;

/**
 * @Author: qiyuan
 * @Date: 2025/02/19 14:12
 * @Description: 抽奖活动服务
 */
@Service
public class RaffleActivityService extends AbstractRaffleActivity {

    public RaffleActivityService(IActivityRepository activityRepository) {
        super(activityRepository);
    }

}
