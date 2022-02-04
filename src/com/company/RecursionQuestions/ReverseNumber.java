package com.company.RecursionQuestions;

public class ReverseNumber {
    public static void main(String[] args) {
        int n=152;
        int digit=(int)((Math.log(n))/Math.log(10))+1;
        int a=rev1(n,digit);
        int sum=0;
        int b=rev2(n,sum);
        System.out.println(a+" "+b);
    }
    public static int rev1(int n,int digit){
        if(n%10==n){
            return n;
        }
        /* Or
        if(n==0){
            return 0;
        }
         */
        int a=n%10;
        return (a*(int)(Math.pow(10,--digit)))+rev1(n/10,digit);
    }

    // Method 2
//    static int sum=0;
    public static int rev2(int n,int sum){
        if(n%10==n){
            sum=sum*10+n;
            return sum;
        }
        int temp=n%10;
        sum=(sum*10)+temp;
        return rev2(n/10,sum);

    }

}
