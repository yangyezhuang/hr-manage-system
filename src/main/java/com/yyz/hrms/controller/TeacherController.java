package com.yyz.hrms.controller;

import com.yyz.hrms.entity.Teacher;
import com.yyz.hrms.service.TeacherService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Teacher)表控制层
 */
@Controller
//@RequestMapping("teacher")
public class TeacherController {

    @Resource
    private TeacherService teacherService;

    @GetMapping("teacher-list")
    public String teacherList(Model model) {
        model.addAttribute("list", teacherService.queryAll());
        return "teacher-list";
    }

    @GetMapping("teacher-add")
    public String teacherAdd() {
        return "teacher-add";
    }


    /**
     * 分页查询
     *
     * @param teacher     筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @GetMapping("/teacher")
    @ResponseBody
    public ResponseEntity<Page<Teacher>> queryByPage(Teacher teacher, PageRequest pageRequest) {
        return ResponseEntity.ok(this.teacherService.queryByPage(teacher, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/teacher/getTeacher/{id}")
    @ResponseBody
    public ResponseEntity<Teacher> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.teacherService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param teacher 实体
     * @return 新增结果
     */
    @PostMapping("/teacher/add")
    @ResponseBody
    public ResponseEntity<Teacher> add(Teacher teacher) {
        return ResponseEntity.ok(this.teacherService.insert(teacher));
    }

    /**
     * 编辑数据
     *
     * @param teacher 实体
     * @return 编辑结果
     */
    @PutMapping("/teacher/update")
    @ResponseBody
    public ResponseEntity<Teacher> edit(Teacher teacher) {
        return ResponseEntity.ok(this.teacherService.update(teacher));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping("/teacher/del/{id}")
    @ResponseBody
    public ResponseEntity<Boolean> deleteById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.teacherService.deleteById(id));
    }

}

