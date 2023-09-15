package com.yyz.hrms.controller;

import com.yyz.hrms.entity.Reward;
import com.yyz.hrms.service.RewardService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Reward)表控制层
 */
@RestController
@RequestMapping("reward")
public class RewardController {
    /**
     * 服务对象
     */
    @Resource
    private RewardService rewardService;

    /**
     * 分页查询
     *
     * @param reward 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Reward>> queryByPage(Reward reward, PageRequest pageRequest) {
        return ResponseEntity.ok(this.rewardService.queryByPage(reward, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/getReward/{id}")
    public ResponseEntity<Reward> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.rewardService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param reward 实体
     * @return 新增结果
     */
    @PostMapping("add")
    public ResponseEntity<Reward> add(Reward reward) {
        return ResponseEntity.ok(this.rewardService.insert(reward));
    }

    /**
     * 编辑数据
     *
     * @param reward 实体
     * @return 编辑结果
     */
    @PutMapping("update")
    public ResponseEntity<Reward> edit(Reward reward) {
        return ResponseEntity.ok(this.rewardService.update(reward));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping("/del/{id}")
    public ResponseEntity<Boolean> deleteById(@PathVariable("id")Integer id) {
        return ResponseEntity.ok(this.rewardService.deleteById(id));
    }

}

