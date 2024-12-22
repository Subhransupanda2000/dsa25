package org.example;

import java.util.Arrays;

public class SumOfTwoArrays {
    public static void main(String[] args) {
        int []arr1={1,9,2,8,3,7,4,6,5};
        int []arr2={9,5,1,8,2,7,3,6,4,9};
        int sum[]=new int[arr1.length];
        for (int i=0;i<=arr1.length-1;i++)
        {

                sum[i]=arr1[i]+arr2[i];
        }
        System.out.println(Arrays.toString(sum));
    }
}
