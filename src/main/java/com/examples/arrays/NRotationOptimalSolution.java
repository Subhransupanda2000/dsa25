package com.examples.arrays;

import java.util.Arrays;

public class NRotationOptimalSolution {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = arr.length;
        int d = 3;
        d = d % n;
        rotation(arr, n, d);
        System.out.println(Arrays.toString(arr));
    }

    private static void rotation(int[] arr, int n, int d) {
        reverse(arr, 0, d - 1);


        reverse(arr, d, n - 1);


        reverse(arr, 0, n - 1);
    }

    static void reverse(int arr[], int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
