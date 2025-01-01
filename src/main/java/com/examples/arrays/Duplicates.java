package com.examples.arrays;

public class Duplicates {
    public static void main(String[] args) {
        int []arr={9,2,8,3,7,4,6,5,8,7,4};
        for (int i=0;i<=arr.length-1;i++)
        {
            for (int j=1;j<=arr.length-1;j++)
            {
               if (arr[i]==arr[j]&&i!=j&&arr[j]!=0)
               {
                   System.out.println(arr[i]);
                   arr[j]=0;
               }
            }
        }

    }
}
