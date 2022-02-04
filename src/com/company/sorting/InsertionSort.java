package com.company.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr ={15,8,1,3,2};
        int[] arr2=insertion_sort(arr);

        print_arr(arr2);
    }

    private static int[] insertion_sort(int[] arr) {
        for(int i=1;i< arr.length;i++){
            int current=arr[i];
            int j=i-1;
            while(j>=0 && current<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        return arr;
    }

    private static void print_arr(int[] arr2) {
        System.out.println(Arrays.toString(arr2));
    }


}
