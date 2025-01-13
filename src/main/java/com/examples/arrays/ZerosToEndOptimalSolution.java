package com.examples.arrays;

import java.util.Arrays;

public class ZerosToEndOptimalSolution {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 3, 0, 4, 0, 5};
        int firstindex = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] != 0) {
                arr[firstindex] = arr[i];
                firstindex++;
            }
        }
        for (int i=firstindex;i<=arr.length-1;i++)
        {
            arr[i]=0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
