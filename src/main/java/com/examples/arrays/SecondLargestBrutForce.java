package com.examples.arrays;

import java.util.Arrays;

public class SecondLargestBrutForce {
    public static void main(String[] args) {
        int[] arr = {1, 9, 2, 7, 2, 6, 3, 5, 4};
        Arrays.sort(arr);
        int secondLargest=-1;
        int largest=arr[arr.length-1];

          for (int i= arr.length-1;i>0;i--)
          {
              if (largest!=arr[i])
              {
                  secondLargest=arr[i];
                  break;
              }
          }
        System.out.println(secondLargest);

    }
}
