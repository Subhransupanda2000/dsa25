package com.examples.arrays;

public class Maximum {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 3, 7, 25, 7};
        maxElement(arr);
    }

    private static void maxElement(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i <= arr.length - 1; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min>arr[i])
            {
                min=arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
