package com.yyz.hrms.service.impl;

import com.yyz.hrms.dao.PostDao;
import com.yyz.hrms.entity.Post;
import com.yyz.hrms.service.PostService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Post)表服务实现类
 */
@Service("postService")
public class PostServiceImpl implements PostService {
    @Resource
    private PostDao postDao;

    @Override
    public List<Post> queryAll() {
        return postDao.queryAll();
    }

    /**
     * 通过ID查询单条数据
     *
     * @param postId 主键
     * @return 实例对象
     */
    @Override
    public Post queryById(Integer postId) {
        return this.postDao.queryById(postId);
    }

    /**
     * 分页查询
     *
     * @param post 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Post> queryByPage(Post post, PageRequest pageRequest) {
        long total = this.postDao.count(post);
        return new PageImpl<>(this.postDao.queryAllByLimit(post, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param post 实例对象
     * @return 实例对象
     */
    @Override
    public Post insert(Post post) {
        this.postDao.insert(post);
        return post;
    }

    /**
     * 修改数据
     *
     * @param post 实例对象
     * @return 实例对象
     */
    @Override
    public Post update(Post post) {
        this.postDao.update(post);
        return this.queryById(post.getPostId());
    }

    /**
     * 通过主键删除数据
     *
     * @param postId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer postId) {
        return this.postDao.deleteById(postId) > 0;
    }
}
