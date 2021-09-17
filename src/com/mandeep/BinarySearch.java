package com.mandeep;

public class BinarySearch {
    static int search_in_bitonic_array(int[] arr, int target){
        int start = 0, end = arr.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid]<arr[mid+1]){
                //inc
                start = mid+1;
            }else {
                //dec
                end = mid;
            }
        }
        //ans = start == peak
        int peak = start;
        if(arr[0]<=target && target<=arr[peak]){
            start = 0;
            end = peak;
            while(start<=end){
                int mid = start + (end-start)/2;
                if(arr[mid] == target) return mid;
                else if(arr[mid] < target) start = mid+1;
                else end = mid-1;
            }
        }if(target<=arr[peak] && target>=arr[arr.length-1]){
            start = peak;
            end = arr.length - 1;
            while(start<=end){
                int mid = start + (end-start)/2;
                if(arr[mid] == target) return mid;
                else if(arr[mid] > target) start = mid+1;
                else end = mid-1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,5,3,1};
        System.out.println(search_in_bitonic_array(arr, 3));
    }
}
