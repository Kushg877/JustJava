package com.company.RecursionQuestions;

import java.util.Arrays;

public class SelectionSort {
    static int checkSmall(int[] arr, int i,int j,int smallest){
        if(i==j){
            if(arr[i]<arr[smallest]){
                return i;
            }
            else{
                return smallest;
            }
        }
        if(arr[i]>arr[i+1]){
            smallest=i+1;
        }
        return checkSmall(arr,i+1,j,smallest);
    }
    static int[] selection(int[] arr,int i,int j){
        if(i==j){
            return arr;
        }
        int smallest=i;
        smallest=checkSmall(arr,i+1,j,smallest);
        if(arr[i]>arr[smallest]){
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        return selection(arr,i+1,j);
    }

    static int[] selection2(int[] arr,int r,int c,int min) {
        if (r == arr.length - 1) {
            return arr;
        }
        if (c > r) {
            if (arr[c] < arr[min]) {
                selection2(arr, r, c - 1, c);
            }
            else{
                selection2(arr,r,c - 1,min);
            }
        }
        else{
            int temp=arr[min];
            arr[min]=arr[r];
            arr[r]=temp;
            selection2(arr,r+1,arr.length-1,r+1);
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={10,9,8,7,6,5,4,3,2,1};
        int[] arr2=selection2(arr,0, arr.length-1, 0);
        System.out.println(Arrays.toString(arr2));
    }
}
