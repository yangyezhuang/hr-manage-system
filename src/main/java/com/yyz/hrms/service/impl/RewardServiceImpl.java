package com.yyz.hrms.service.impl;

import com.yyz.hrms.dao.RewardDao;
import com.yyz.hrms.entity.Reward;
import com.yyz.hrms.service.RewardService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Reward)表服务实现类
 */
@Service("rewardService")
public class RewardServiceImpl implements RewardService {
    @Resource
    private RewardDao rewardDao;

    @Override
    public List<Reward> queryAll() {
        return rewardDao.queryAll();
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Reward queryById(Integer id) {
        return this.rewardDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param reward 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Reward> queryByPage(Reward reward, PageRequest pageRequest) {
        long total = this.rewardDao.count(reward);
        return new PageImpl<>(this.rewardDao.queryAllByLimit(reward, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param reward 实例对象
     * @return 实例对象
     */
    @Override
    public Reward insert(Reward reward) {
        this.rewardDao.insert(reward);
        return reward;
    }

    /**
     * 修改数据
     *
     * @param reward 实例对象
     * @return 实例对象
     */
    @Override
    public Reward update(Reward reward) {
        this.rewardDao.update(reward);
        return this.queryById(reward.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.rewardDao.deleteById(id) > 0;
    }
}
