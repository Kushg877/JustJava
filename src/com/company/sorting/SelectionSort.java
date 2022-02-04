package com.company.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr ={6,8,1,3,2};
        int[] arr2=selection_sort(arr);

        print_arr(arr2);
    }
    public static int[] selection_sort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int smallest=i;
            for(int j=i+1;j< arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        return arr;
    }
    public static void print_arr(int[] arr){
        System.out.println(Arrays.toString(arr));
    }
}
