package com.lzw.sort;


/*
    1.先对数组的前两个数据进行排序

    2.然后将第三个数据与已排序的前两个数据比较，插入到合适的位置

    3.然后将第四个数据与已排序的前三个数据比较，将其插入到合适的位置

    4.不断重复以上步骤直至最后一个数据插入到合适的位置

 */


import java.util.Arrays;

public class InsertionSort {


    public static int[] sort(int [] nums){
        int[]args= Arrays.copyOf(nums,nums.length);
        int temp;
        int j;
        for (int i=1;i<args.length;i++){
            temp=args[i];
            j=i-1;
            while (j>=0&&temp<args[j]){
                args[j+1]=args[j];
                j--;
            }
            args[j+1]=temp;
            System.out.print("第"+i+"次：");
            for (int k:args){
                System.out.print(k+" ");
            }
            System.out.print("\n");
        }

        return args;
    }

}
