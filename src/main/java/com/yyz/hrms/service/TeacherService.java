package com.yyz.hrms.service;

import com.yyz.hrms.entity.Teacher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

/**
 * (Teacher)表服务接口
 */
public interface TeacherService {

    List<Teacher> queryAll();


    /**
     * 通过ID查询单条数据
     *
     * @param tchId 主键
     * @return 实例对象
     */
    Teacher queryById(Integer tchId);

    /**
     * 分页查询
     *
     * @param teacher 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Teacher> queryByPage(Teacher teacher, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param teacher 实例对象
     * @return 实例对象
     */
    Teacher insert(Teacher teacher);

    /**
     * 修改数据
     *
     * @param teacher 实例对象
     * @return 实例对象
     */
    Teacher update(Teacher teacher);

    /**
     * 通过主键删除数据
     *
     * @param tchId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer tchId);

}
