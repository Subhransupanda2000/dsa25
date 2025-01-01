package com.examples.arrays;

import java.util.Arrays;

public class Largest3Element {
    public static void main(String[] args) {
        int []arr={1,8,27,36,30,5,8,7,6,3,4,27,36,30};
        largest3Element(arr);
    }
    public static void largest3Element(int []arr)
    {
        Arrays.sort(arr);
        int count=0;
        for (int i=arr.length-1;i>=0;i--)
        {
            if (arr[i]!=arr[i-1])
            {
                System.out.println(arr[i]);
                count++;
                if (count==3)
                {
                    return;
                }
            }
        }
    }
}
