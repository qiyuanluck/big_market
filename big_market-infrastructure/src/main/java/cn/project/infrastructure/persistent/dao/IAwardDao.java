package cn.project.infrastructure.persistent.dao;

import cn.project.infrastructure.persistent.po.Award;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: qiyuan
 * @Date: 2024/11/25 19:58
 * @Description: 奖品表 Dao
 */
@Mapper
public interface IAwardDao {
    List<Award> queryAwardList();
}
