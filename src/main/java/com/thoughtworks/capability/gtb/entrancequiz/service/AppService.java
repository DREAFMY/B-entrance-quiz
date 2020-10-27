package com.thoughtworks.capability.gtb.entrancequiz.service;

import com.thoughtworks.capability.gtb.entrancequiz.domain.Student;
import com.thoughtworks.capability.gtb.entrancequiz.domain.Team;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class AppService {
    private List<Student> studentList;
    private List<Team> teamList;

    public AppService() {
        studentList = new ArrayList<>();
        studentList.add(new Student(1, "成吉思汗"));
        studentList.add(new Student(2, "鲁班七号"));
        studentList.add(new Student(3, "太乙真人"));
        studentList.add(new Student(4, "钟无艳"));
        studentList.add(new Student(5, "花木兰"));
        studentList.add(new Student(6, "雅典娜"));
        studentList.add(new Student(7, "芈月"));
        studentList.add(new Student(8, "白起"));
        studentList.add(new Student(9, "刘禅"));
        studentList.add(new Student(10, "庄周"));
        studentList.add(new Student(11, "马超"));
        studentList.add(new Student(12, "刘备"));
        studentList.add(new Student(13, "哪吒"));
        studentList.add(new Student(14, "大乔"));
        studentList.add(new Student(15, "蔡文姬"));
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void addStudent(String name) {
        studentList.add(new Student(studentList.size()+1,name));
    }

    public List<Team> getTeamList() {
        studentList.stream().forEach(item -> {
            item.setGroupId((int) (Math.random() * 100));
        });
        Collections.sort(studentList);
        teamList = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
        }
        studentList.stream().forEach(item -> {

        });
        return null;
    }
}
