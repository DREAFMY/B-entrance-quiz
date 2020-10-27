package com.thoughtworks.capability.gtb.entrancequiz.controller;

import com.thoughtworks.capability.gtb.entrancequiz.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AppController {

    @Autowired
    AppService appService;

    @GetMapping("/student")
    @CrossOrigin
    public ResponseEntity getStudentList() {
        return ResponseEntity.ok(appService.getStudentList());
    }

    @PostMapping("/student/{name}")
    @CrossOrigin
    public ResponseEntity addStudent(@PathVariable String name) {
        appService.addStudent(name);
        return ResponseEntity.created(null).build();
    }

    @GetMapping("/team")
    @CrossOrigin
    public ResponseEntity getTeamList() {
        return ResponseEntity.ok(appService.getTeamList());
    }
}
