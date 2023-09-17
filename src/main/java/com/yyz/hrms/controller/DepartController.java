package com.yyz.hrms.controller;

import com.yyz.hrms.entity.Depart;
import com.yyz.hrms.service.DepartService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Depart)表控制层
 */
@Controller
//@RequestMapping("depart")
public class DepartController {

    @Resource
    private DepartService departService;


    @GetMapping("depart-list")
    public String departList(Model model) {
        model.addAttribute("list", departService.queryAll());
        return "depart-list";
    }

    @GetMapping("depart-add")
    public String departAdd() {
        return "depart-add";
    }

    /**
     * 分页查询
     *
     * @param depart 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping("/depart")
    @ResponseBody
    public ResponseEntity<Page<Depart>> queryByPage(Depart depart, PageRequest pageRequest) {
        return ResponseEntity.ok(this.departService.queryByPage(depart, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/depart/getDepart/{id}")
    @ResponseBody
    public ResponseEntity<Depart> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.departService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param depart 实体
     * @return 新增结果
     */
    @PostMapping("/depart/add")
    @ResponseBody
    public ResponseEntity<Depart> add(Depart depart) {
        return ResponseEntity.ok(this.departService.insert(depart));
    }

    /**
     * 编辑数据
     *
     * @param depart 实体
     * @return 编辑结果
     */
    @PutMapping("/depart/update")
    @ResponseBody
    public ResponseEntity<Depart> edit(Depart depart) {
        return ResponseEntity.ok(this.departService.update(depart));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping("/depart/del/{id}")
    @ResponseBody
    public ResponseEntity<Boolean> deleteById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.departService.deleteById(id));
    }

}

