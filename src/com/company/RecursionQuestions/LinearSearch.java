package com.company.RecursionQuestions;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,89};
        int target=100;
        System.out.println(Lsearch(arr,target,0));
    }
    static int Lsearch(int[] arr,int target,int i){
        if(i>arr.length-1){
            return -1;
        }
        if(arr[i]==target){
            return i;
        }
        return Lsearch(arr,target,i+1);
    }
}
