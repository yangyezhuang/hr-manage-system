package com.yyz.hrms.controller;

import com.yyz.hrms.entity.Family;
import com.yyz.hrms.service.FamilyService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Family)表控制层
 */
@RestController
@RequestMapping("family")
public class FamilyController {
    /**
     * 服务对象
     */
    @Resource
    private FamilyService familyService;

    /**
     * 分页查询
     *
     * @param family 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Family>> queryByPage(Family family, PageRequest pageRequest) {
        return ResponseEntity.ok(this.familyService.queryByPage(family, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/getFamily/{id}")
    public ResponseEntity<Family> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.familyService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param family 实体
     * @return 新增结果
     */
    @PostMapping("add")
    public ResponseEntity<Family> add(Family family) {
        return ResponseEntity.ok(this.familyService.insert(family));
    }

    /**
     * 编辑数据
     *
     * @param family 实体
     * @return 编辑结果
     */
    @PutMapping("/update")
    public ResponseEntity<Family> edit(Family family) {
        return ResponseEntity.ok(this.familyService.update(family));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping("/del/{id}")
    public ResponseEntity<Boolean> deleteById(@PathVariable("id")Integer id) {
        return ResponseEntity.ok(this.familyService.deleteById(id));
    }

}

