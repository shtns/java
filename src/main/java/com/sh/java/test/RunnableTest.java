package com.sh.java.test;

import lombok.SneakyThrows;

/**
 * 实现Runnable同步锁
 *
 * @author e
 * @date 2020/3/21 16:31
 */
public class RunnableTest implements Runnable{

    private Integer ticket = 100;

    @SneakyThrows
    @Override
    public void run() {

        while (true) {
            synchronized(this) {
                if (ticket > 0) {
                    Thread.sleep(100);
                    System.out.println("(" + Thread.currentThread().getName() + ")" + "..." + "当前票数:" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}

class Test {

    public static void main(String[] args) {

        RunnableTest runnableTest = new RunnableTest();

        Thread thread = new Thread(runnableTest);
        Thread thread2 = new Thread(runnableTest);
        Thread thread3 = new Thread(runnableTest);

        thread.setName("窗口1");
        thread2.setName("窗口2");
        thread3.setName("窗口3");

        thread.start();
        thread2.start();
        thread3.start();
    }
}