package com.examples.arrays;

import java.util.Arrays;

public class NRotation {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8,9,10};
        int n=arr.length;
        int d=19;
        d=d%n;
        rotation(arr,n,d);
    }

    private static void rotation(int[] arr, int n, int d) {
        int temp[]=new int[d];
        int j=0;
        for (int i=0;i<=d-1;i++)
        {
            temp[i]=arr[i];
        }
        for (int i=d;i<n;i++)
        {
            arr[j]=arr[i];j++;
        }
        j=0;
        for (int i=n-d;i<n;i++)
        {
            arr[i]=temp[j];j++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
