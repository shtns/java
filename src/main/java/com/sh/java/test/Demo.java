package com.sh.java.test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 *
 *
 * @author e
 * @date 2020/3/23 22:09
 */
public class Demo {

    public static void main(String[] args) throws IOException {

        List<Student> students = Arrays.asList(new Student("张三", 20),
                                               new Student("李四", 21),
                                               new Student("王五", 22),
                                               new Student("赵六", 23),
                                               new Student("哈七", 24)
                                               );


    }
}
