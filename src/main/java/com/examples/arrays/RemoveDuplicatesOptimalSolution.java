package com.examples.arrays;

import java.util.Arrays;

public class RemoveDuplicatesOptimalSolution {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 2, 3, 3,4,4,4,4,4,4,5,5,5,5,5,5,5,6,6,6,6,6,6,7,7,7};
        int size= duplicate(arr);
        for (int i=0;i<=size-1;i++)
        {
            System.out.print(arr[i]+" ");
        }


    }
    public static int duplicate(int[] arr)
    {
        int i=0;
        for (int j=1;j<=arr.length-1;j++)
        {
            if (arr[j]!=arr[i])
            {
                arr[i+1]=arr[j];
                i++;
            }
        }
        return i+1;
    }
}
