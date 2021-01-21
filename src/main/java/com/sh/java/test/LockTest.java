package com.sh.java.test;

import lombok.SneakyThrows;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Lock锁
 *
 * @author e
 * @date 2020/3/22 19:57
 */
public class LockTest implements Runnable {

    private Integer ticket = 100;

    private ReentrantLock lock = new ReentrantLock();

    @SneakyThrows
    @Override
    public void run() {

        while (true) {
            try {
                lock.lock();
                if (ticket > 0) {
                    Thread.sleep(100);
                    System.out.println("(" + Thread.currentThread().getName() + ")" + "..." + "当前票数:" + ticket);
                    ticket--;
                }
            } finally {
                lock.unlock();
            }
        }
    }
}

class Test7 {

    public static void main(String[] args) {

        LockTest lockTest = new LockTest();

        Thread thread = new Thread(lockTest);
        Thread thread2 = new Thread(lockTest);
        Thread thread3 = new Thread(lockTest);

        thread.setName("窗口1");
        thread2.setName("窗口2");
        thread3.setName("窗口3");

        thread.start();
        thread2.start();
        thread3.start();
    }
}