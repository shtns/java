package com.sh.java.test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Comparator定制排序
 *
 * @author e
 * @date 2020/3/23 19:41
 */
public class ComparatorTest {

    public static void main(String[] args) {

        Goods[] goods = new Goods[5];
        goods[0] = new Goods("lenOvoMouse", 34.0d);
        goods[1] = new Goods("dellMouse", 43.0d);
        goods[2] = new Goods("xiaMiMouse", 12.0d);
        goods[3] = new Goods("huaWeiMouse", 65.0d);
        goods[4] = new Goods("huaWeiMouse", 222.0d);
        Arrays.sort(goods, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Goods && o2 instanceof Goods) {
                    Goods goods = (Goods) o1;
                    Goods goods2 = (Goods) o2;
                    if (goods.getName().equals(goods2.getName())) {
                        return -Double.compare(goods.getPrice(), goods2.getPrice());
                    } else {
                        return goods.getName().compareTo(goods2.getName());
                    }
                }
                throw new RuntimeException("类型输入错误");
            }});
        System.out.println(Arrays.toString(goods));
    }
}
