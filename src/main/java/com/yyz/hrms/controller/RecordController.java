package com.yyz.hrms.controller;

import com.yyz.hrms.entity.Record;
import com.yyz.hrms.service.RecordService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Record)表控制层
 */
@Controller
//@RequestMapping("record")
public class RecordController {

    @Resource
    private RecordService recordService;

    @GetMapping("record-list")
    public String recordList(Model model) {
        model.addAttribute("list", recordService.queryAll());
        return "record-list";
    }

    @GetMapping("record-add")
    public String recordAdd() {
        return "record-add";
    }

    /**
     * 分页查询
     *
     * @param record 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping("/record")
    @ResponseBody
    public ResponseEntity<Page<Record>> queryByPage(Record record, PageRequest pageRequest) {
        return ResponseEntity.ok(this.recordService.queryByPage(record, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/record/getRecord/{id}")
    @ResponseBody
    public ResponseEntity<Record> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.recordService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param record 实体
     * @return 新增结果
     */
    @PostMapping("/record/add")
    @ResponseBody
    public ResponseEntity<Record> add(Record record) {
        return ResponseEntity.ok(this.recordService.insert(record));
    }

    /**
     * 编辑数据
     *
     * @param record 实体
     * @return 编辑结果
     */
    @PutMapping("/record/update")
    @ResponseBody
    public ResponseEntity<Record> edit(Record record) {
        return ResponseEntity.ok(this.recordService.update(record));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping("/record/del/{id}")
    @ResponseBody
    public ResponseEntity<Boolean> deleteById(@PathVariable("id")Integer id) {
        return ResponseEntity.ok(this.recordService.deleteById(id));
    }

}

