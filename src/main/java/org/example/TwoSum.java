package org.example;

public class TwoSum {
    public static void main(String[] args) {
        int userinput = 9;
        int[] arr = {9, 4, 7, 1, 5, 8};
        int min = arr[0];
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        for (int i = 0; i <= arr.length - 1; i++) {
            if (min + arr[i] == userinput) {
                System.out.println(arr[i]);
                System.out.println(min);
            }
        }

    }
}
