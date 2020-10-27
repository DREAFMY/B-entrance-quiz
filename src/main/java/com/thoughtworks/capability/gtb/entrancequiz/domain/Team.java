package com.thoughtworks.capability.gtb.entrancequiz.domain;

import java.util.List;

public class Team {
    private String name;
    private List<Student> studentList;

    public Team(String name, List<Student> studentList) {
        this.name = name;
        this.studentList = studentList;
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", studentList=" + studentList +
                '}';
    }
}
