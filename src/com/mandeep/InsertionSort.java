package com.mandeep;


import java.util.Arrays;

/*
For eavery index put that element at the right position in the Left array
*/
public class InsertionSort {
    public static void main(String[] args){
        int[] arr = {4,2,5,2,6,2,8,90,100,1,-3};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) {
        for(int i=1;i<arr.length;i++){
            int j = i;
            while(j>=1 && arr[j-1]>arr[j]){
//                int temp = arr[j];
//                arr[j] = arr[j-1];
//                arr[j-1] = temp;
                swap(arr, j,j-1);
                j--;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
    }

}


