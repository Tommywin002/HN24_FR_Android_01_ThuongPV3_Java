package com.example.hn24_fr_android_01_thuongpv3_java.assignments.assignment2.question5;

import java.util.List;

public class ClassRoom {
    private List<Student> studentList;

    public ClassRoom(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
    //counting student's age is 23 and origins is HaNoi
    public int countStudent(){
        int count = 0;
        for (Student student: studentList) {
            if(student.getAge() == 23 && student.getOriginPlace().equals("hanoi"))
                count++;
        }
        return count;
    }
}
