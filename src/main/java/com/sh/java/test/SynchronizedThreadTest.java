package com.sh.java.test;

import lombok.SneakyThrows;

/**
 * 同步方法Thread锁
 *
 * @author e
 * @date 2020/3/22 18:37
 */
public class SynchronizedThreadTest extends Thread{

    private static Integer ticket = 100;

    @SneakyThrows
    @Override
    public void run() {

        while (true) {
            show();
        }
    }

    public static synchronized void show() throws InterruptedException {

        if (ticket > 0) {
            sleep(100);
            System.out.println("(" + Thread.currentThread().getName() + ")" + "..." + "当前票数:" + ticket);
            ticket--;
        }
    }
}

class Test4 {

    public static void main(String[] args) {

        SynchronizedThreadTest stt = new SynchronizedThreadTest();
        SynchronizedThreadTest stt2 = new SynchronizedThreadTest();
        SynchronizedThreadTest stt3 = new SynchronizedThreadTest();

        stt.setName("窗口1");
        stt2.setName("窗口2");
        stt3.setName("窗口3");

        stt.start();
        stt2.start();
        stt3.start();
    }
}

