package cn.project.domain.activity.service.product;

import cn.project.domain.activity.model.entity.SkuProductEntity;
import cn.project.domain.activity.repository.IActivityRepository;
import cn.project.domain.activity.service.IRaffleActivitySkuProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: qiyuan
 * @Date: 2025/05/08 17:03
 * @Description:
 */
@Service
public class RaffleActivitySkuProductService implements IRaffleActivitySkuProductService {

    @Resource
    private IActivityRepository repository;

    @Override
    public List<SkuProductEntity> querySkuProductEntityListByActivityId(Long activityId) {
        return repository.querySkuProductEntityListByActivityId(activityId);
    }

}

