package com.thoughtworks.capability.gtb.entrancequiz.service;

import com.thoughtworks.capability.gtb.entrancequiz.domain.Student;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class AppService {
    private List<Student> studentList;

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

    public Map<Integer, List<Student>> getTeamList() {
        List<Student> st = studentList.subList(0,studentList.size());
        Collections.shuffle(st);
        Map<Integer, List<Student>> map = new HashMap<>();
        for (int i = 0; i < 6; i++) {
            List<Student> students = new ArrayList<>();
            map.put(i, students);
        }
        int mark = studentList.size();
        int listIndex = 0;
        int groupIndex =0 ;
        while (mark >0) {
            Student student = studentList.get(listIndex);
            map.get(groupIndex).add(student);
            mark --;
            listIndex++;
            if ((groupIndex + 1) > 5) {
                groupIndex =0;
            } else {
                groupIndex++;
            }
        }
        return map;
    }
}
