package com.sh.java.test;

import lombok.ToString;

/**
 * enum枚举的使用
 *
 * @author e
 * @date 2020/3/23 20:27
 */
public class EnumTest {

    public static void main(String[] args) throws InterruptedException {

        Season[] values = Season.values();

        for (int i = 0; i < values.length; i++) {
            Thread.sleep(1000);
            System.out.print(values[i]);
            values[i].show();
        }
    }
}

interface Info {
    void show();
}

@ToString
enum Season implements Info {

    SPRING("春", "春暖花开") {
        @Override
        public void show() {
            System.out.println("11111");
        }
    },
    SUMMER("夏", "夏日炎炎") {
        @Override
        public void show() {
            System.out.println("22222");
        }
    },
    AUTUMN("秋", "秋高气爽") {
        @Override
        public void show() {
            System.out.println("33333");
        }
    },
    WINTER("东", "冬暖夏至") {
        @Override
        public void show() {
            System.out.println("44444");
        }
    };

    private String seasonName;
    private String seasonDesc;

    Season(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }
}
