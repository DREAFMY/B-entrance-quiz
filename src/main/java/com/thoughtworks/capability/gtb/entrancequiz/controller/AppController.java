package com.thoughtworks.capability.gtb.entrancequiz.controller;

import com.thoughtworks.capability.gtb.entrancequiz.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//TODO GTB-工程实践: - AppController.java:11 controller命名需要符合资源命名
public class AppController {

    //TODO GTB-知识点: - AppController.java:13 推荐使用构造器注入
    @Autowired
    AppService appService;

    @GetMapping("/student")
    @CrossOrigin
    public ResponseEntity getStudentList() {
        return ResponseEntity.ok(appService.getStudentList());
    }

    //TODO GTB-知识点: - AppController.java:22 根据restful实践，资源名一般是复数
    //TODO GTB-知识点: - AppController.java:23 根据restful实践，POST方法一般返回创建的内容或者Id
    //TODO GTB-知识点: - AppController.java:24 如果不是有自定义返回的需求，ResponseEntity一般可省略
    //TODO GTB-知识点: - AppController.java:25 Post请求的传参方式，一般使用@RequestBody
    @PostMapping("/student/{name}")
    @CrossOrigin
    public ResponseEntity addStudent(@PathVariable String name) {
        appService.addStudent(name);
        return ResponseEntity.created(null).build();
    }

    //TODO GTB-工程实践: - AppController.java:34 team相关的接口，单独抽取一个controller来做，与students不是操作的一个资源
    @GetMapping("/team")
    @CrossOrigin
    public ResponseEntity getTeamList() {
        return ResponseEntity.ok(appService.getTeamList());
    }

    //TODO GTB-完成度: - AppController.java:40 缺少专门查看team的接口
}
