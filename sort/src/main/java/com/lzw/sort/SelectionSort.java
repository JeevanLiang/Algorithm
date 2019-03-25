package com.lzw.sort;



/*
    1.先从未排序数组中选择最小的一个数据，然后将其与第一个位置的数据交换

    2.然后从剩下的n-1个数据中选择其中最小的数据与第二个位置的数据交换

    3.不断重复以上操作，直到最后一个位置的数据交换完
 */

import java.util.Arrays;

public class SelectionSort {


    public static int[] sort(int[] nums){
        int[]args= Arrays.copyOf(nums,nums.length);
        int index;
        int temp;

        for (int i=0;i<args.length;i++){
            index=i;
            for (int j=i+1;j< args.length;j++){
                if (args[j]<args[index]){
                    index=j;
                }
            }
            if (index!=i){
                temp=args[i];
                args[i]=args[index];
                args[index]=temp;
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
