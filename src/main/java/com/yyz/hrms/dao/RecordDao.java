package com.yyz.hrms.dao;

import com.yyz.hrms.entity.Record;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * (Record)表数据库访问层
 */
@Mapper
public interface RecordDao {

    List<Record> queryAll();


    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Record queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param record 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<Record> queryAllByLimit(Record record, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param record 查询条件
     * @return 总行数
     */
    long count(Record record);

    /**
     * 新增数据
     *
     * @param record 实例对象
     * @return 影响行数
     */
    int insert(Record record);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Record> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Record> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Record> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Record> entities);

    /**
     * 修改数据
     *
     * @param record 实例对象
     * @return 影响行数
     */
    int update(Record record);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

