package com.yyz.hrms.service;

import com.yyz.hrms.entity.Family;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

/**
 * (Family)表服务接口
 */
public interface FamilyService {

    List<Family> queryAll();


    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Family queryById(Integer id);

    /**
     * 分页查询
     *
     * @param family 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Family> queryByPage(Family family, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param family 实例对象
     * @return 实例对象
     */
    Family insert(Family family);

    /**
     * 修改数据
     *
     * @param family 实例对象
     * @return 实例对象
     */
    Family update(Family family);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
