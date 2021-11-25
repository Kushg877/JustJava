package com.company.searching;

import java.util.Arrays;
import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int target = in.nextInt();
        int ans = linearsearch(arr , target);
        System.out.println(ans);
        System.out.println(Arrays.toString(arr));;
    }
    public static int linearsearch(int[] arr , int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

}
