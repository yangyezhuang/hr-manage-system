package com.yyz.hrms.service;

import com.yyz.hrms.entity.Reward;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

/**
 * (Reward)表服务接口
 */
public interface RewardService {

    List<Reward> queryAll();


    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Reward queryById(Integer id);

    /**
     * 分页查询
     *
     * @param reward 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Reward> queryByPage(Reward reward, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param reward 实例对象
     * @return 实例对象
     */
    Reward insert(Reward reward);

    /**
     * 修改数据
     *
     * @param reward 实例对象
     * @return 实例对象
     */
    Reward update(Reward reward);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
