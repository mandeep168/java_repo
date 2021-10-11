package com.mandeep;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,1,324,1,2,1,4,4,5,1,2};
        slectionsort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void slectionsort(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n;i++){
            int mini = arr[i],index = i;
            for(int j=i+1;j<n;j++) {
                if (mini > arr[j]) {
                    index = j;
                    mini = arr[j];
                }
            }
            arr[index] = arr[i];
            arr[i] = mini;
        }
    }
}
