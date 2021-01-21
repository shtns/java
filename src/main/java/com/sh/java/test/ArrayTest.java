package com.sh.java.test;

/**
 * 二维数组
 *
 * @author e
 * @date 2020/3/16 20:27
 */
public class ArrayTest {

    public static void main(String[] args) throws InterruptedException {

        int[][][][][] numArr = new int[][][][][]{{{{{1,2,3}}}}, {{{{4,5,6}}}}, {{{{7,8,9}}}},};

        for (int i = 0; i < numArr.length; i++) {
            for (int j = 0; j < numArr[i].length; j++) {
                for (int x = 0; x < numArr[i][j].length; x++) {
                    for (int y = 0; y < numArr[i][j][x].length; y++) {
                        for (int k = 0; k < numArr[i][j][x][y].length; k++) {
                            System.out.println(numArr[i][j][x][y][k]);
                        }
                        Thread.sleep(3000);
                        System.out.println();
                    }
                }
            }
        }
    }
}