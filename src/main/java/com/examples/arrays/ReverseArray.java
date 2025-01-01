package com.examples.arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 3, 7, 25, 7};
        reverseArray(arr);
    }

    private static void reverseArray(int[] arr) {
        for (int i= arr.length-1;i>=0;i--)
        {
            System.out.println(arr[i]);
        }
    }
}
