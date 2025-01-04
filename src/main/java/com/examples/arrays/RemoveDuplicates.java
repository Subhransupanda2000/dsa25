package com.examples.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 2, 3, 3};
        Set<Integer> st = new HashSet<>();
        for (int i = 0; i <= arr.length - 1; i++) {
            st.add(arr[i]);
        }
        int setSize = st.size();
        int[] arr2 = new int[setSize];
        int index = 0;
        for (Integer res : st) {
            arr2[index] = res;
            index++;
        }
        System.out.println(Arrays.toString(arr2));
    }
}
