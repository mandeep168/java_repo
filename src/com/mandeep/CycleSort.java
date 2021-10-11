package com.mandeep;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr = {3,2,1};
        csort(arr);
        System.out.println(Arrays.toString(arr));
    }
    // O(N)
    public static void csort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
              int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
            else {
                i++;
            }
        }
    }

}
