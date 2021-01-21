package com.sh.java.test;

import lombok.Data;
import lombok.ToString;

/**
 * 商品
 *
 * @author e
 * @date 2020/3/23 19:48
 */
@Data
@ToString
public class Goods implements Comparable {

    private String name;
    private Double price;

    Goods(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(Object o) {

        if (o instanceof Goods) {
            Goods goods = (Goods) o;
            if (this.price < goods.price) {
                return 1;
            } else if (this.price > goods.price) {
                return -1;
            } else {
                return 0;
            }
        }
        throw new RuntimeException("数据类型不一致");
    }
}
