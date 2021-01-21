package com.sh.java.test;

import lombok.SneakyThrows;

/**
 * 同步方法Runnable锁
 *
 * @author e
 * @date 2020/3/22 18:32
 */
public class SynchronizedRunnableTest implements Runnable {

    private Integer ticket = 100;

    @SneakyThrows
    @Override
    public void run() {

        while (true) {
            show();
        }
    }

    private synchronized void show() throws InterruptedException {

        if (ticket > 0) {
            Thread.sleep(100);
            System.out.println("(" + Thread.currentThread().getName() + ")" + "..." + "当前票数:" + ticket);
            ticket--;
        }
    }
}


class Test3 {

    public static void main(String[] args) {

        SynchronizedRunnableTest srt = new SynchronizedRunnableTest();

        Thread thread = new Thread(srt);
        Thread thread2 = new Thread(srt);
        Thread thread3 = new Thread(srt);

        thread.setName("窗口1");
        thread2.setName("窗口2");
        thread3.setName("窗口3");

        thread.start();
        thread2.start();
        thread3.start();
    }
}
