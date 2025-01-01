package com.examples.arrays;

import java.util.Arrays;

public class Sort0s1s2s {
    public static void main(String[] args) {
        int []arr={1,2,0,0,1,0,2,2,1};
        int []arr2=new int[arr.length];
        int coun0=0;
        int count1=0;
        int count2=0;
        for (int i=0;i<=arr.length-1;i++)
        {
            if (arr[i]==0)
            {
                coun0++;
            } else if (arr[i]==1) {
                count1++;
            } else if (arr[i]==2) {
                count2++;
            }
        }
        int idx=0;
        for (int i=0;i< coun0;i++)
        {
            arr2[idx++]=0;
        }
        for (int i=0;i<count1;i++)
        {
            arr2[idx++]=1;
        }for (int i=0;i< count2;i++)
        {
            arr2[idx++]=2;
        }
        System.out.println(Arrays.toString(arr2));
    }
}
