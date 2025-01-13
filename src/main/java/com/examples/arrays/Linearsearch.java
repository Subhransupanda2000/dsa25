package com.examples.arrays;

public class Linearsearch {
    public static void main(String[] args) {
        int[] arr = {1, 9, 2, 8, 3, 7, 4, 6, 5};
        int res=m1(arr);
        System.out.println(res);
    }

    public static int m1(int[] arr) {
        int num = 4;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == num) {
                return i;
            }

        }
        return -1;
    }
}
