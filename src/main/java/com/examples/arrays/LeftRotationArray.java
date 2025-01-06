package com.examples.arrays;

import java.util.Arrays;

public class LeftRotationArray {
    public static void main(String[] args) {
        int[] arr = {5, 1, 2, 3, 4};
        int temp = arr[0];
        for (int i = 1; i <= arr.length - 1; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;
        System.out.println(Arrays.toString(arr));
    }
}
