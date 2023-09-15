package com.yyz.hrms.service;

import com.yyz.hrms.entity.Post;
import javafx.geometry.Pos;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

/**
 * (Post)表服务接口
 */
public interface PostService {

    List<Post> queryAll();


    /**
     * 通过ID查询单条数据
     *
     * @param postId 主键
     * @return 实例对象
     */
    Post queryById(Integer postId);

    /**
     * 分页查询
     *
     * @param post 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Post> queryByPage(Post post, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param post 实例对象
     * @return 实例对象
     */
    Post insert(Post post);

    /**
     * 修改数据
     *
     * @param post 实例对象
     * @return 实例对象
     */
    Post update(Post post);

    /**
     * 通过主键删除数据
     *
     * @param postId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer postId);

}
