package com.yyz.hrms.dao;

import com.yyz.hrms.entity.Family;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * (Family)表数据库访问层
 */
@Mapper
public interface FamilyDao {

    List<Family> queryAll();

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Family queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param family 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<Family> queryAllByLimit(Family family, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param family 查询条件
     * @return 总行数
     */
    long count(Family family);

    /**
     * 新增数据
     *
     * @param family 实例对象
     * @return 影响行数
     */
    int insert(Family family);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Family> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Family> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Family> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Family> entities);

    /**
     * 修改数据
     *
     * @param family 实例对象
     * @return 影响行数
     */
    int update(Family family);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

