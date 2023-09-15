package com.yyz.hrms.controller;


import com.yyz.hrms.entity.Post;
import com.yyz.hrms.service.PostService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Post)表控制层
 */
@RestController
@RequestMapping("post")
public class PostController {
    /**
     * 服务对象
     */
    @Resource
    private PostService postService;

    /**
     * 分页查询
     *
     * @param post 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Post>> queryByPage(Post post, PageRequest pageRequest) {
        return ResponseEntity.ok(this.postService.queryByPage(post, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/getPost/{id}")
    public ResponseEntity<Post> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.postService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param post 实体
     * @return 新增结果
     */
    @PostMapping("add")
    public ResponseEntity<Post> add(Post post) {
        return ResponseEntity.ok(this.postService.insert(post));
    }

    /**
     * 编辑数据
     *
     * @param post 实体
     * @return 编辑结果
     */
    @PutMapping("update")
    public ResponseEntity<Post> edit(Post post) {
        return ResponseEntity.ok(this.postService.update(post));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping("/del/{id}")
    public ResponseEntity<Boolean> deleteById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.postService.deleteById(id));
    }

}

