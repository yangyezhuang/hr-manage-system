package com.yyz.hrms.service;

import com.yyz.hrms.entity.Record;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

/**
 * (Record)表服务接口
 */
public interface RecordService {

    List<Record> queryAll();


    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Record queryById(Integer id);

    /**
     * 分页查询
     *
     * @param record 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Record> queryByPage(Record record, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param record 实例对象
     * @return 实例对象
     */
    Record insert(Record record);

    /**
     * 修改数据
     *
     * @param record 实例对象
     * @return 实例对象
     */
    Record update(Record record);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
