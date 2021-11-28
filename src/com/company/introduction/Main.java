package com.company.introduction;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello World");
        Scanner in = new Scanner(System.in);
//        char ch = 'Y';
//        int a = (int)(ch);
//        System.out.println(a);
//        int b=in.nextInt();
//        int n=0;
//        while(b!=0){
//            n=(n*10)+(b%10);
//            b=b/10;
//        }
//        String str1="";
//        while(n!=0){
//            int a=((n%10)+7);
//            str1 = str1+Integer.toString(a);
//            n=n/10;
//        }
//        System.out.println(str1);
//        int[] arr={1,2,3};
//        change(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//    static void change(int[] arr){
//
//        arr[0]=5;
//        System.out.println(Arrays.toString(arr));
//    }
//        int[][] arr=new int[5][4];
//        System.out.println(arr.length);
//        System.out.println(arr[4].length);
//        String a="kush";
//        a+="b";
//        System.out.println(a);
//        System.out.println(56);
//        System.out.println("kush");
//        while(true){
//            int n=in.nextInt();
//            int flag=0;
//            if(n<0||n>100){
//                System.out.print("Error");
//                continue;
//            }
//            int a=0;
//            int b=1;
//            for(int i=0;i<n;i++){
//                System.out.print(a+" ");
//                int temp=a+b;
//                a=b;
//                b=temp;
//            }
//            break;
        int n=in.nextInt();
        char[] arr=Integer.toString(n).toCharArray();
        int a=n;
        int sum=0;
        while(n!=0){
            int b=n%10;
            sum=(sum*10)+b;
//            arr[i]=b;
            n=n/10;
//            i++;
        }
//        if(a==sum){
//            asc(arr);
//        }
//        else{
//            dsc(arr);
//        }
        char ch='1';
        int b=(int)(ch);
        System.out.println(b);
    }
    static void asc(int[] arr){
        int n= arr.length;
        int i, j, temp;
        for (i = 0; i < n - 1; i++)
        {
            for (j = 0; j < n - i - 1; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    static void dsc(int[] arr){
        int n= arr.length;
        int i, j, temp;
        for (i = 0; i < n - 1; i++)
        {
            for (j = 0; j < n - i - 1; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
//        System.out.println(Arrays.toString(arr));
    }
    static void charToInt(char[] arr) {
        int arr1[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = (int) (arr[i]);
        }
    }
}
