package com.examples.arrays;

public class SecondLargestBestsolution {
    public static void main(String[] args) {
        int[] arr = {1, 9, 2, 7, 2, 6, 3, 5, 4};
        int largest=arr[0];
        int secondlargest=-1;
        for (int i=0;i<=arr.length-1;i++)
        {
            if (arr[i]>largest)
            {
                largest=arr[i];
            }
        }
        for (int i=0;i<=arr.length-1;i++)
        {
            if (arr[i]!=largest&&secondlargest<arr[i])
            {
                secondlargest=arr[i];
            }
        }
        System.out.println(secondlargest);
    }
}
