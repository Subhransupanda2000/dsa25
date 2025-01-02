package com.examples.arrays;

import java.util.Arrays;

public class LargestElement {
    public static void main(String[] args) {
        int []arr={1,7,2,6,3,5,4,8};
        int result=largest(arr);
        System.out.println(result);
    }
    public static int largest(int []arr)
    {
        Arrays.sort(arr);
        for (int i=arr.length-2;i>0;i--)
        {
            if (arr[i]!=arr[arr.length-1])
            {
                return arr[i];
            }
        }
        return -1;
    }
}

