package com.lzw.sort;





/*
    1.对数组中的各数据，依次比较相邻的两个元素的大小

    2.如果前面的数据大于（倒叙则小于）后面的数据，就交换两个元素（如果是从后往前，第一轮过后最小的数据就会排在最前面）

    3.再用同样的方式把剩下的数据逐个进行比较，最后便可按照从小到大的顺序排好

 */

import java.util.Arrays;

public class BubbleSort {

    public static int[] sort(int [] nums){
        int[]args= Arrays.copyOf(nums,nums.length);
        int temp;

        for (int i=1;i<args.length;i++){
            for (int j=0;j<args.length-i;j++){
                if (args[j]>args[j+1]){
                    temp=args[j];
                    args[j]=args[j+1];
                    args[j+1]=temp;
                }
            }
            System.out.print("第"+i+"次：");
            for (int k:args){
                System.out.print(k+" ");
            }
            System.out.print("\n");
        }

        return args;
    }

}
