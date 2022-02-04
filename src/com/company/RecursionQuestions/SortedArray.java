package com.company.RecursionQuestions;

import com.company.introduction.Array;

import java.util.Arrays;

public class SortedArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] arr2={1,4,8,2,3};

        System.out.println(sort(arr,0));
        System.out.println(sort2(arr2));
    }
    static boolean sort(int[] arr,int i){
        if(i== arr.length-1){
            return true;
        }
        return (arr[i] <arr[i+1]) && sort(arr,i+1);
    }
    static int i=0;
    static boolean sort2(int[] arr){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[arr.length-1]){
            return false;
        }
        ++i;
        return sort2(arr);
    }
}
