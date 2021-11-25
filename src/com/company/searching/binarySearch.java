package com.company.searching;

import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {

            arr[i] = in.nextInt();

        }
        int target = in.nextInt();
        int ans = searchBinary(arr, target);
        System.out.println(ans + 1);
    }

    public static int searchBinary(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + ((end - start) / 2));
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
