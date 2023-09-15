package com.yyz.hrms.dao;

import com.yyz.hrms.entity.Depart;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * (Depart)表数据库访问层
 */
@Mapper
public interface DepartDao {

    List<Depart> queryAll();

    /**
     * 通过ID查询单条数据
     *
     * @param departId 主键
     * @return 实例对象
     */
    Depart queryById(Integer departId);

    /**
     * 查询指定行数据
     *
     * @param depart 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<Depart> queryAllByLimit(Depart depart, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param depart 查询条件
     * @return 总行数
     */
    long count(Depart depart);

    /**
     * 新增数据
     *
     * @param depart 实例对象
     * @return 影响行数
     */
    int insert(Depart depart);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Depart> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Depart> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Depart> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Depart> entities);

    /**
     * 修改数据
     *
     * @param depart 实例对象
     * @return 影响行数
     */
    int update(Depart depart);

    /**
     * 通过主键删除数据
     *
     * @param departId 主键
     * @return 影响行数
     */
    int deleteById(Integer departId);

}

