package com.lzw.sort;

import java.util.Arrays;
/*
    Shell排序是基于插入排序的思想，又称为希尔排序或者缩小增量排序

    1.将n个元素的数组分成n/2个数字序列，第一个数据与第n/2+1个数据为一组，第二个与第n/2+2一组，以此类推

    2.第一次循环将所有序列排好顺序

    3.然后将数组分成上一次的一半个数字序列（n/2）/2，再次排序

    4.不断重复以上过程，当序列为一个时，排序完成


*/


public class ShellSort  {

    public static int[] sort(int[] nums){
        int[]args= Arrays.copyOf(nums,nums.length);
        int i,j,h;
        int r,temp;
        int x=0;

        for(r= args.length/2;r>=1;r/=2){

            for (i=r;i< args.length;i++){
                temp=args[i];
                j=i-r;
                while (j>=0&&temp<args[j]){
                    args[j+r]=args[j];
                    j-=r;
                }
                args[j+r]=temp;
                x++;
                System.out.print("第"+x+"次：");
                for (int k:args){
                    System.out.print(k+" ");
                }
                System.out.print("\n");

            }

        }

        return args;
    }


}
