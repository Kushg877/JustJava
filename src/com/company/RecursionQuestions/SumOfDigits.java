package com.company.RecursionQuestions;

public class SumOfDigits {
    public static void main(String[] args) {
        int digit=12345;
        int a=sum(digit);
        System.out.println(a);

    }
    public static int sum(int digit){
        if(digit/10==0){
            return digit;
        }
        int a=digit%10;
        digit=digit/10;
        return a+sum(digit);
    }

//    ***ANOTHER WAY***
    public static int sum2(int digit){
        if(digit==0){
            return 0;
        }
        return (digit%10)+sum2(digit/10);  // Find Recurrence relationship---> Most important
    }
}
