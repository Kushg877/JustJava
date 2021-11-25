package com.company.introduction;
import java.util.Arrays;
import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
/*ques1*/
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int ans1 = PrintAverage(a,b,c);
        System.out.println(ans1);
/*ques2*/
        int d = in.nextInt();
        int ans2 = SumOfOdd(d);
        System.out.println(ans2);
/*ques3*/
        int e = in.nextInt();
        int f = in.nextInt();
        int ans3 = GreaterOfTwo(e,f);
        System.out.println(ans3);
/*ques7*/
        CountNumber();
/*ques8*/
        int g = in.nextInt();
        int h = in.nextInt();
        int ans4 = PowerOfAnother(g,h);
        System.out.println(ans4);
/*ques9*/
        int i = in.nextInt();
        int j = in.nextInt();
        int ans5 = GreatestCommonDivisor(i,j);
        System.out.println(ans5);
/*ques10*/
        int k = in.nextInt();
        PrintFibo(i);
/* Extra Knowledge*/
        Varargs(1,2,3,4,5);

    }
    public static int PrintAverage(int x, int y, int z){
        return (x+y+z)/3;
    }
    public static int SumOfOdd(int w){
        int sum=0;
        for (int i = 1; i < w; i++) {
            if(i%2!=0){
                sum+=i;
            }
        }
        return sum;
    }

    public static int GreaterOfTwo(int u, int v){
        return Math.max(u, v);
    }
    public static void CountNumber(){
        Scanner in = new Scanner(System.in);
        char ch = 'y';
        int count1=0;
        int count2=0;
        int count3=0;
        do {
            System.out.print("Enter Number: ");
            int g = in.nextInt();
            if(g>0)
                count1++;
            else if(g<0)
                count2++;
            else
                count3++;
            System.out.print("Do You Want to continue (y/n): ");
            char ch1=in.next().charAt(0);
            ch=ch1;
        } while(ch=='y');
        System.out.println("Total Positive Numbers are: "+count1);
        System.out.println("Total negative numbers are: "+count2);
        System.out.println("Total Zeroes are: "+count3);
    }
    public static int PowerOfAnother(int s , int t){
        int product=1;
        for (int i = 0; i < t; i++) {
            product*=s;
        }
        return product;
    }
    public static int GreatestCommonDivisor(int q , int r){
            while(q!=r)
                if(q>r)
                    q = q-r;
                else
                    r = r-q;
            return q;
    }
    public static void PrintFibo(int p){
        int a = 0;
        int b = 1;
        for(int i=0;i<p-2;i++){
            System.out.println(a);
            int temp = a;
            a = b;
            b = b+temp;
        }
    }
    public static void Varargs(int...v){
        System.out.println(Arrays.toString(v));

    }

}
