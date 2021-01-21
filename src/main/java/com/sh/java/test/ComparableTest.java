package com.sh.java.test;

import java.util.Arrays;

/**
 * Comparable自然排序
 *
 * @author e
 * @date 2020/3/23 13:44
 */
public class ComparableTest {

    public static void main(String[] args) {

        Goods[] goods = new Goods[4];
        goods[0] = new Goods("lenOvoMouse", 34.0d);
        goods[1] = new Goods("dellMouse", 43.0d);
        goods[2] = new Goods("xiaMiMouse", 12.0d);
        goods[3] = new Goods("huaWeiMouse", 65.0d);
        Arrays.sort(goods);
        System.out.println(Arrays.toString(goods));
    }
}


