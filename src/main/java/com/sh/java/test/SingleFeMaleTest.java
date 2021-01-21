package com.sh.java.test;

/**
 * 懒汉单例模式
 *
 * @author e
 * @date 2020/3/22 19:10
 */
class SingleFeMaleTest {

    private SingleFeMaleTest() {}

    private static SingleFeMaleTest instance = null;

    static SingleFeMaleTest getInstance() {

        if (instance == null) {
            synchronized (SingleFeMaleTest.class) {
                if (instance == null) {
                    instance = new SingleFeMaleTest();
                }
            }
        }
        return instance;
    }
}

class Test6 {

    public static void main(String[] args) {

        SingleFeMaleTest instance = SingleFeMaleTest.getInstance();
        SingleFeMaleTest instance2 =SingleFeMaleTest.getInstance();

        System.out.println(instance == instance2);
    }
}
