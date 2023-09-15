package com.yyz.hrms.controller;

import com.yyz.hrms.entity.Teacher;
import com.yyz.hrms.service.TeacherService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Teacher)表控制层
 */
@RestController
@RequestMapping("teacher")
public class TeacherController {
    /**
     * 服务对象
     */
    @Resource
    private TeacherService teacherService;

    /**
     * 分页查询
     *
     * @param teacher     筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Teacher>> queryByPage(Teacher teacher, PageRequest pageRequest) {
        return ResponseEntity.ok(this.teacherService.queryByPage(teacher, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/getTeacher/{id}")
    public ResponseEntity<Teacher> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.teacherService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param teacher 实体
     * @return 新增结果
     */
    @PostMapping("add")
    public ResponseEntity<Teacher> add(Teacher teacher) {
        return ResponseEntity.ok(this.teacherService.insert(teacher));
    }

    /**
     * 编辑数据
     *
     * @param teacher 实体
     * @return 编辑结果
     */
    @PutMapping("update")
    public ResponseEntity<Teacher> edit(Teacher teacher) {
        return ResponseEntity.ok(this.teacherService.update(teacher));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping("/del/{id}")
    public ResponseEntity<Boolean> deleteById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.teacherService.deleteById(id));
    }

}

