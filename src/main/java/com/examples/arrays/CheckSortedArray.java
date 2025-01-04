package com.examples.arrays;

public class CheckSortedArray {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6};
        boolean result=sortedArray(arr);
        System.out.println(result);
    }

    private static boolean sortedArray(int[] arr) {
        boolean flag=false;
        for (int i=1;i<=arr.length-1;i++)
        {
            if (arr[i]<arr[i-1])
            {
                return false;
            }

        }
        return true;
    }
}
