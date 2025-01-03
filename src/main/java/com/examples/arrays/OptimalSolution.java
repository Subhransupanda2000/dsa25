package com.examples.arrays;

public class OptimalSolution {
    public static void main(String[] args) {
        int[] arr = {1, 9, 2, 7, 2, 6, 3, 5, 4};

        int largest=arr[0];
        int secondLargest=-1;
        for (int i=0;i<= arr.length-1;i++)
        {
            if (arr[i]>largest)
            {
                largest=arr[i];

            }
            else if(largest!=arr[i]&&secondLargest<arr[i])
            {
                secondLargest=arr[i];
            }
        }
        System.out.println(secondLargest);
    }
}
