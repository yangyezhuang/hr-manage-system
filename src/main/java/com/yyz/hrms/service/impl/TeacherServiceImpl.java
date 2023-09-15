package com.yyz.hrms.service.impl;

import com.yyz.hrms.dao.TeacherDao;
import com.yyz.hrms.entity.Teacher;
import com.yyz.hrms.service.TeacherService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Teacher)表服务实现类
 */
@Service("teacherService")
public class TeacherServiceImpl implements TeacherService {
    @Resource
    private TeacherDao teacherDao;

    @Override
    public List<Teacher> queryAll() {
        return teacherDao.queryAll();
    }

    /**
     * 通过ID查询单条数据
     *
     * @param tchId 主键
     * @return 实例对象
     */
    @Override
    public Teacher queryById(Integer tchId) {
        return this.teacherDao.queryById(tchId);
    }

    /**
     * 分页查询
     *
     * @param teacher     筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @Override
    public Page<Teacher> queryByPage(Teacher teacher, PageRequest pageRequest) {
        long total = this.teacherDao.count(teacher);
        return new PageImpl<>(this.teacherDao.queryAllByLimit(teacher, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param teacher 实例对象
     * @return 实例对象
     */
    @Override
    public Teacher insert(Teacher teacher) {
        this.teacherDao.insert(teacher);
        return teacher;
    }

    /**
     * 修改数据
     *
     * @param teacher 实例对象
     * @return 实例对象
     */
    @Override
    public Teacher update(Teacher teacher) {
        this.teacherDao.update(teacher);
        return this.queryById(teacher.getTchId());
    }

    /**
     * 通过主键删除数据
     *
     * @param tchId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer tchId) {
        return this.teacherDao.deleteById(tchId) > 0;
    }
}
