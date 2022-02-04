package com.company.RecursionQuestions;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,7,15,66,598};
        int target=15;
        int ans=bs(arr,target,0, arr.length-1);
        System.out.println(ans);
    }
    public static int bs(int[] arr,int target,int s,int e){
        if(s>e){
            return -1;
        }
        int m=s+(e-s)/2;
        if(arr[m]==target){
            return m;
        }
        if(arr[m]>target){
            e=m-1;
        }
        else{
            s=m+1;
        }
        return bs(arr,target,s,e);
    }
}
