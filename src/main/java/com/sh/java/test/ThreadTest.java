package com.sh.java.test;

import lombok.SneakyThrows;

/**
 * 继承Thread同步锁
 *
 * @author e
 * @date 2020/3/22 18:11
 */
public class ThreadTest extends Thread {

    private static Integer ticket = 100;

    @SneakyThrows
    @Override
    public void run() {

        while (true) {
            synchronized (ThreadTest.class) {
                if (ticket > 0) {
                    sleep(100);
                    System.out.println("(" + getName() + ")" + "..." + "当前票数:" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}

class Test2 {

    public static void main(String[] args) {

        ThreadTest threadTest = new ThreadTest();
        ThreadTest threadTest2 = new ThreadTest();
        ThreadTest threadTest3 = new ThreadTest();

        threadTest.setName("窗口1");
        threadTest2.setName("窗口2");
        threadTest3.setName("窗口3");

        threadTest.start();
        threadTest2.start();
        threadTest3.start();
    }
}