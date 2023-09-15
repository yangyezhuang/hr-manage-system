package com.yyz.hrms.service.impl;

import com.yyz.hrms.dao.DepartDao;
import com.yyz.hrms.entity.Depart;
import com.yyz.hrms.service.DepartService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Depart)表服务实现类
 */
@Service("departService")
public class DepartServiceImpl implements DepartService {
    @Resource
    private DepartDao departDao;

    /**
     * 查询全部
     *
     * @return
     */
    @Override
    public List<Depart> queryAll() {
        return departDao.queryAll();
    }

    /**
     * 通过ID查询单条数据
     *
     * @param departId 主键
     * @return 实例对象
     */
    @Override
    public Depart queryById(Integer departId) {
        return this.departDao.queryById(departId);
    }

    /**
     * 分页查询
     *
     * @param depart      筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @Override
    public Page<Depart> queryByPage(Depart depart, PageRequest pageRequest) {
        long total = this.departDao.count(depart);
        return new PageImpl<>(this.departDao.queryAllByLimit(depart, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param depart 实例对象
     * @return 实例对象
     */
    @Override
    public Depart insert(Depart depart) {
        this.departDao.insert(depart);
        return depart;
    }

    /**
     * 修改数据
     *
     * @param depart 实例对象
     * @return 实例对象
     */
    @Override
    public Depart update(Depart depart) {
        this.departDao.update(depart);
        return this.queryById(depart.getDepartId());
    }

    /**
     * 通过主键删除数据
     *
     * @param departId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer departId) {
        return this.departDao.deleteById(departId) > 0;
    }
}
