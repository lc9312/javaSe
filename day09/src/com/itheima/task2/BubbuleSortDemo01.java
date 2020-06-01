package com.itheima.task2;

import java.util.Arrays;

/*请按以下要求顺序编写程序：
        	定义测试类，定义main()方法；
        	定义以下数组：
        int[] arr = {1,2,432,32,54,32,3,7,657,563,25,43,6,463,52};
        	用Arrays类打印此数组的所有元素；
        	用“冒泡排序”对数组元素“升序”排序；打印排序后的数组。*/
public class BubbuleSortDemo01 {
    public static void main(String[] args) {
        // 1、定义数组
        int[] arr = {1,2,432,32,54,32,3,7,657,563,25,43,6,463,52};

        // 2、打印遍历数组元素
        System.out.println(Arrays.toString(arr));

        // 3、冒泡算法对数组排序
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 -i; j++) {
                if (arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }

        // 打印排序后的数组
        System.out.println("======================================");
        System.out.println(Arrays.toString(arr));
        System.out.println("冒泡排序第二个版本");
    }
}
