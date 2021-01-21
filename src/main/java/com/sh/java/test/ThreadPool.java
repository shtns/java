package com.sh.java.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * 线程池
 *
 * 好处：提供响应速度(减少了创建线程的时间)，降低资源消耗(重复利用线程池中的线程)，方便线程的一个管理
 *
 * @author e
 * @date 2020/3/23 12:39
 */
public class ThreadPool {

    public static void main(String[] args) {

        //1、提供制定线程数量的线程池
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;

        /*
        2、设置线程池的属性
        线程池大小
        threadPoolExecutor.setCorePoolSize(1000);
        最大线程数
        threadPoolExecutor.setMaximumPoolSize(100);
        线程池没有任务最多保持多少时间后终止
        threadPoolExecutor.setKeepAliveTime();
        */

        //2、执行指定的线程操作，需要提供实现Runnable接口或Callable接口实现类的对象
        executorService.execute(new Num());
        executorService.execute(new Num2());

        //3、关闭线程池
        executorService.shutdown();
    }
}

class Num implements Runnable {

    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {
            if (i % 2  == 0) {
                System.out.println(i);
            }
        }
    }
}


class Num2 implements Runnable {

    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}

