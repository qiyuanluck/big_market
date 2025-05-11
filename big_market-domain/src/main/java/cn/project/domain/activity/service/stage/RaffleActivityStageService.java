package cn.project.domain.activity.service.stage;

import cn.project.domain.activity.adapter.repository.IActivityRepository;
import cn.project.domain.activity.model.entity.RaffleActivityStageEntity;
import cn.project.domain.activity.service.IRaffleActivityStageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: qiyuan
 * @Date: 2025/05/11 18:42
 * @Description:
 */
@Service
public class RaffleActivityStageService implements IRaffleActivityStageService {

    @Resource
    private IActivityRepository repository;

    @Override
    public void appendStageActivity(String channel, String source, Long activityId) {
        repository.appendStageActivity(channel, source, activityId);
    }

    @Override
    public void updateStageActivity2Active(Long id) {
        repository.updateStageActivity2Active(id);
    }

    @Override
    public Long queryStageActivityId(String channel, String source) {
        return repository.queryStageActiveBySC(channel, source);
    }

    @Override
    public List<RaffleActivityStageEntity> queryStageActivityList() {
        return repository.queryStageActivityList();
    }

    @Override
    public Long queryStageActivity2ActiveById(Long id) {
        return repository.queryStageActivity2ActiveById(id);
    }

}

