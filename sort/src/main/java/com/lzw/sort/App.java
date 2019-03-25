package com.lzw.sort;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int[]nums=new int[20];
        for (int i=0;i<20;i++){
            nums[i]=(int)(Math.random()*(100+1));
        }
//        BubbleSort.sort(nums);
        InsertionSort.sort(nums);
    }
}
