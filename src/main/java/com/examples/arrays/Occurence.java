package com.examples.arrays;

public class Occurence {
    public static void main(String[] args) {
        int []arr={2,1,2,1,2,1,3,4,3,2,1,2,1};
        int target=2;
        int count=0;
        for (int i=0;i<=arr.length-1;i++)
        {
            if (arr[i]==target)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
