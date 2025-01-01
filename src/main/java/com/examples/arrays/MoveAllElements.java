package com.examples.arrays;

import java.util.Arrays;

public class MoveAllElements {
    public static void main(String[] args) {
        int []arr={1,-3,2,-4,7,-8};
        int []arr2=new int[arr.length];
        int idx=0;
        int lastidx= arr.length-1;
        for (int i=0;i<= arr.length-1;i++)
        {
            if (arr[i]<=0)
            {
                arr2[idx++]=arr[i];
            }else {
                arr2[lastidx--]=arr[i];
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
}
