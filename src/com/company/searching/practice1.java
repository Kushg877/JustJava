package com.company.searching;

import java.util.Scanner;

public class practice1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }
        int target = in.nextInt();
        System.out.println(ceilingNumber(arr , target));
    }
    public static int ceilingNumber(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int ans = arr[0];
        while(start<=end){
            int mid =start+((end-start)/2);
            if(arr[mid]<target){
                start = mid+1;
            }
            else{
                ans = arr[mid];
                end = mid-1;
            }
        }
        return ans;
    }
}