package com.company.RecursionQuestions;

public class Count0 {
    public static void main(String[] args) {
        int a=3040980;
        int b=count(a,0);
        System.out.println(b);
    }
    static int count(int n,int c){
        if(n%10==n){
            return c;
        }
        if(n%10==0){
            ++c;
        }
        return count(n/10,c);
    }
}
