package com.sh.java.test;

import lombok.SneakyThrows;

/**
 * 线程交互执行
 *
 * @author e
 * @date 2020/3/23 10:47
 */
public class CommunicationTest {

    public static void main(String[] args) {

        Number number = new Number();

        Thread thread = new Thread(number);
        Thread thread2 = new Thread(number);

        thread.setName("线程1");
        thread2.setName("线程2");

        thread.start();
        thread2.start();
    }
}

class Number implements Runnable {

    private Integer number = 1;

    @SneakyThrows
    @Override
    public void run() {

        while (true) {
           show();
        }
    }

    private synchronized void show() throws InterruptedException {

        notify();
        if (number <= 100) {
            System.out.println(Thread.currentThread().getName() + ":" + number);
            number++;
            wait();
        }
    }
}
