package com.examples.arrays;

public class LargestElementInArray {
    public static void main(String[] args) {
        int []arr={1,8,2,7,3,6,5,9,4,0};
        int result=largestElement(arr);
        System.out.println(result);
    }
    public static int largestElement(int[] arr)
    {
        int largest=arr[0];
        for (int i=0;i<=arr.length-1;i++)
        {
            if (arr[i]>largest)
            {
                largest=arr[i];
            }
        }
        return largest;
    }
}
