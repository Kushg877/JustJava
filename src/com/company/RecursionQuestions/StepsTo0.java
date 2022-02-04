package com.company.RecursionQuestions;

public class StepsTo0 {
    public static void main(String[] args) {
        int n=8;
        System.out.println(steps(n,0));
    }
    static int steps(int n,int c){
        if(n<=0){
            return c;
        }
        if(n%2==0){
            return steps(n/2,++c);
        }
        return steps(n-1,++c);
    }
}
