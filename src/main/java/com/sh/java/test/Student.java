package com.sh.java.test;

import lombok.Data;

/**
 * 学生
 *
 * @author e
 * @date 2020/3/24 21:40
 */
@Data
public class Student{

    String studentName;
    Integer studentAge;

    public Student(String studentName, Integer studentAge) {
        this.studentName = studentName;
        this.studentAge = studentAge;
    }
}
