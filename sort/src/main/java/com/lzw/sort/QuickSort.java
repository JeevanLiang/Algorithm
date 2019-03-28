package com.lzw.sort;

/*

    1.首先设一个分界值，通过该分界值将数组分成左右两部分

    2.将小于分界值的数据都放在数组左边，大于等于分界值的数据都放在数组右边

    3.然后将左右两部分分别独立排序，排序规则与步骤1、2一样

    4.重复以上步骤，递归将左右两边的部分排序好，完成后整个数组的排序就已排好


 */


import java.util.Arrays;

public class QuickSort {

    public static int[] sort(int [] num){
        int[] arr= Arrays.copyOf(num,num.length);
        return quickSort(arr,0,arr.length-1);
    }

    protected static int[] quickSort(int[]arr,int left,int right){
        if  (left<right){
            int p=partition(arr,left,right);
            quickSort(arr,left,p-1);
            quickSort(arr,p+1,right);
        }
        return arr  ;
    }


    protected static int partition(int[]arr,int left,int right){
        int p=left;
        int index=left+1;
        int tem;
        for (int i=index;i<arr.length;i++){
            if  (arr[i]<arr[p]){
                tem=arr[i];
                arr[i]=arr[index];
                arr[index++]=tem;
            }
        }
        tem=arr[p];
        arr[p]=arr[index-1];
        arr[index-1]=tem;

        return index-1;
    }


}
