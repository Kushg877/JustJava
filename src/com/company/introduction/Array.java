package com.company.introduction;
import java.util.Scanner;
public class Array {
//Important Note:
//    DATATYPE OF 1D Array is the datatype name itself
//       for example:
//          DATATYPE OF int[] or String[] is int and String itself
//       WHEREAS
//          DATATYPE OF 2D Array is the datatype name + []
//            for example:
//               DATATYPE OF int[][] or String[][] is int[] and String[]
//               Because DATATYPE OF EVERY SINGLE ELEMENT IN 2D ARRAY IS ITSELF AN ARRAY
//
//    Declaring 1D array:
//        int[] arr = new int[5];
//    or
//        int[] arr = {25,25,25,25,25,25,2,5}
//
//    Declaring 2D array:
//        int[][] arr = new int[5][]; // it is mandatory to give row size and optional to give column size
//    or
//        int[][] arr = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = {25,25,25,25,25,25};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        call(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

//        String[] a = new String[5];
//        for (int i = 0; i < a.length; i++) {
//            a[i] = in.next();
//        }

//        int[] arr3 = new int[5];
//        int[] arr4 = {1,2,3,4,5,6,7,8,9};
//        System.out.println(Arrays.toString(a));
//        String[] str2 = new String[5];
//        System.out.println(str2[0]);
//        for (int i = 0; i < str2.length; i++) {
//            str2[i]=in.next();
//        }
//        System.out.println(Arrays.toString(str2));
//        change(str2);
//        System.out.println(Arrays.toString(str2));
//        System.out.print("Enter row: ");
//        int row = in.nextInt();
//        System.out.println();
//        System.out.print("Enter column");
//        int col = in.nextInt();
//        System.out.println();
//        int[][] arr2D = new int[row][col];
//        for (int i = 0; i < arr2D.length; i++) {
//            for (int j = 0; j < arr2D[i].length; j++) {
//                arr2D[i][j] = in.nextInt();
//            }
//        }
////        System.out.println(Arrays.toString(arr2D));
//        int n = in.nextInt();
//        int[][] arr = new int[n][n];
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = in.nextInt();
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//
//        }
//        System.out.println(Arrays.toString(arr));
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(Arrays.toString(arr[i])+" ");
//        }
//        System.out.println(Arrays.toString(arr));
//   [[1,2,3],[4,5,6],[7,8,9]]
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(Arrays.toString(arr[i])+" ");
//        }
    }
    public static void call(int[] arr){
        arr[0] = 26;
    }
//    public static void change(String[] str3){
//        Scanner in = new Scanner(System.in);
//        for (int i = 0; i < str3.length; i++) {
//            str3[i] = in.next();
//        }
//    }

}
