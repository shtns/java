package com.sh.java.test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 实现Callable创建线程
 *
 * @author e
 * @date 2020/3/23 13:13
 */
public class CallableTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        NumThread numThread = new NumThread();

        FutureTask futureTask = new FutureTask(numThread);

        new Thread(futureTask).start();

        Object sum = futureTask.get();
        System.out.println("总和:" + sum);
    }
}

class NumThread implements Callable {

    @Override
    public Object call() throws Exception {

        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
                System.out.println(i);

            }
        }
        return sum;
    }
}
