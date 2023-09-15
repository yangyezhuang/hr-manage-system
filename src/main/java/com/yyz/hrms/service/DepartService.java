package com.yyz.hrms.service;

import com.yyz.hrms.entity.Depart;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

/**
 * (Depart)表服务接口
 */
public interface DepartService {

    List<Depart> queryAll();

    /**
     * 通过ID查询单条数据
     *
     * @param departId 主键
     * @return 实例对象
     */
    Depart queryById(Integer departId);

    /**
     * 分页查询
     *
     * @param depart 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Depart> queryByPage(Depart depart, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param depart 实例对象
     * @return 实例对象
     */
    Depart insert(Depart depart);

    /**
     * 修改数据
     *
     * @param depart 实例对象
     * @return 实例对象
     */
    Depart update(Depart depart);

    /**
     * 通过主键删除数据
     *
     * @param departId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer departId);

}
