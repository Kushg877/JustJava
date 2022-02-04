package com.company.RecursionQuestions;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
      int[] arr={8,7,6,5,4};
        int[] arr2=bubble2(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr2));
    }
    static int[] bubble(int[] arr,int i,int j){
        if(i==j){
            return arr;
        }
        if(arr[i]>arr[i+1]){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        bubble(arr,i+1,j);
        return bubble(arr,i,j-1);
    }
    static int[] bubble2(int[] arr,int r,int c){
        if(r==0){
            return arr;
        }
        if(c<r){
            if(arr[c]>arr[c+1]){
                int temp=arr[c+1];
                arr[c+1]=arr[c];
                arr[c]=temp;
            }
            bubble2(arr,r,c+1);
        }
        else{
            bubble2(arr,r-1,c);
        }
        return arr;
    }
}
