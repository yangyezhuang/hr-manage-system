package com.yyz.hrms.service.impl;

import com.yyz.hrms.dao.FamilyDao;
import com.yyz.hrms.entity.Family;
import com.yyz.hrms.service.FamilyService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Family)表服务实现类
 */
@Service("familyService")
public class FamilyServiceImpl implements FamilyService {
    @Resource
    private FamilyDao familyDao;

    @Override
    public List<Family> queryAll() {
        return familyDao.queryAll();
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Family queryById(Integer id) {
        return this.familyDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param family 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Family> queryByPage(Family family, PageRequest pageRequest) {
        long total = this.familyDao.count(family);
        return new PageImpl<>(this.familyDao.queryAllByLimit(family, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param family 实例对象
     * @return 实例对象
     */
    @Override
    public Family insert(Family family) {
        this.familyDao.insert(family);
        return family;
    }

    /**
     * 修改数据
     *
     * @param family 实例对象
     * @return 实例对象
     */
    @Override
    public Family update(Family family) {
        this.familyDao.update(family);
        return this.queryById(family.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.familyDao.deleteById(id) > 0;
    }
}
