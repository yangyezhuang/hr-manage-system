package com.yyz.hrms.dao;

import com.yyz.hrms.entity.Post;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * (Post)表数据库访问层
 */
@Mapper
public interface PostDao {

    List<Post> queryAll();


    /**
     * 通过ID查询单条数据
     *
     * @param postId 主键
     * @return 实例对象
     */
    Post queryById(Integer postId);

    /**
     * 查询指定行数据
     *
     * @param post 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<Post> queryAllByLimit(Post post, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param post 查询条件
     * @return 总行数
     */
    long count(Post post);

    /**
     * 新增数据
     *
     * @param post 实例对象
     * @return 影响行数
     */
    int insert(Post post);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Post> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Post> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Post> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Post> entities);

    /**
     * 修改数据
     *
     * @param post 实例对象
     * @return 影响行数
     */
    int update(Post post);

    /**
     * 通过主键删除数据
     *
     * @param postId 主键
     * @return 影响行数
     */
    int deleteById(Integer postId);

}

