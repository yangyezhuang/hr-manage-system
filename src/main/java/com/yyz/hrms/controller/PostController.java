package com.yyz.hrms.controller;


import com.yyz.hrms.entity.Post;
import com.yyz.hrms.service.PostService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Post)表控制层
 */
@Controller
//@RequestMapping("post")
public class PostController {

    @Resource
    private PostService postService;

    @GetMapping("post-list")
    public String postList(Model model) {
        model.addAttribute("list", postService.queryAll());
        return "post-list";
    }

    @GetMapping("post-add")
    public String postAdd() {
        return "post-add";
    }

    /**
     * 分页查询
     *
     * @param post 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping("/post")
    @ResponseBody
    public ResponseEntity<Page<Post>> queryByPage(Post post, PageRequest pageRequest) {
        return ResponseEntity.ok(this.postService.queryByPage(post, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/post/getPost/{id}")
    @ResponseBody
    public ResponseEntity<Post> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.postService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param post 实体
     * @return 新增结果
     */
    @PostMapping("/post/add")
    @ResponseBody
    public ResponseEntity<Post> add(Post post) {
        return ResponseEntity.ok(this.postService.insert(post));
    }

    /**
     * 编辑数据
     *
     * @param post 实体
     * @return 编辑结果
     */
    @PutMapping("/post/update")
    @ResponseBody
    public ResponseEntity<Post> edit(Post post) {
        return ResponseEntity.ok(this.postService.update(post));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping("/post/del/{id}")
    @ResponseBody
    public ResponseEntity<Boolean> deleteById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.postService.deleteById(id));
    }

}

