package com.examples.arrays;

import java.util.Arrays;

public class ZerosToEnd {
    public static void main(String[] args) {
        int[]arr={1,0,2,0,3,0,4,0,5};
        int []arr2=new int[arr.length];
        int lastindex=arr.length-1;
        int firstindex=0;
        for(int i=0;i<=arr.length-1;i++)
        {
            if (arr[i]==0)
            {
                arr2[lastindex]=0;
                lastindex--;
            }
            else {
                arr2[firstindex]=arr[i];
                firstindex++;
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
}
