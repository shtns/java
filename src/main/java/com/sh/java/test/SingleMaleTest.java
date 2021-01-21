package com.sh.java.test;

/**
 * 饿汉单例模式
 *
 * @author e
 * @date 2020/3/22 18:48
 */
class SingleMaleTest {

    /**
     * 私有化构造器
     */
    private SingleMaleTest() {}

    /**
     * 内部创建对象
     */
    private static SingleMaleTest instance = new SingleMaleTest();

    /**
     * 提供公共的对象访问方法
     *
     *
     * @return SingleMaleTest
     */
    static SingleMaleTest getInstance() {
        return instance;
    }
}

class Test5 {

    public static void main(String[] args) {

        SingleMaleTest singleMaleTest = SingleMaleTest.getInstance();
        SingleMaleTest singleMaleTest2 =SingleMaleTest.getInstance();

        System.out.println(singleMaleTest == singleMaleTest2);
    }
}
