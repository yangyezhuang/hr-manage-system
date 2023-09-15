package com.yyz.hrms.controller;

import com.yyz.hrms.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
    @Autowired
    private DepartService departService;
    @Autowired
    private FamilyService familyService;
    @Autowired
    private PostService postService;
    @Autowired
    private RecordService recordService;
    @Autowired
    private RewardService rewardService;
    @Autowired
    private TeacherService teacherService;


    @GetMapping("welcome")
    public String welcome() {
        return "welcome";
    }

    @GetMapping("welcome1")
    public String welcome1() {
        return "home";
    }

    @GetMapping("depart-list")
    public String departList(Model model) {
        model.addAttribute("list", departService.queryAll());
        return "depart-list";
    }

    @GetMapping("depart-add")
    public String departAdd() {
        return "depart-add";
    }

    @GetMapping("family-list")
    public String familyList(Model model) {
        model.addAttribute("list", familyService.queryAll());
        return "family-list";
    }

    @GetMapping("family-add")
    public String familyAdd() {
        return "family-add";
    }

    @GetMapping("post-list")
    public String postList(Model model) {
        model.addAttribute("list", postService.queryAll());
        return "post-list";
    }

    @GetMapping("post-add")
    public String postAdd() {
        return "post-add";
    }

    @GetMapping("record-list")
    public String recordList(Model model) {
        model.addAttribute("list", recordService.queryAll());
        return "record-list";
    }

    @GetMapping("record-add")
    public String recordAdd() {
        return "record-add";
    }

    @GetMapping("reward-list")
    public String rewardList(Model model) {
        model.addAttribute("list", rewardService.queryAll());
        return "reward-list";
    }

    @GetMapping("reward-add")
    public String rewardAdd() {
        return "reward-add";
    }


    @GetMapping("teacher-list")
    public String teacherList(Model model) {
        model.addAttribute("list", teacherService.queryAll());
        return "teacher-list";
    }

    @GetMapping("teacher-add")
    public String teacherAdd() {
        return "teacher-add";
    }
}
