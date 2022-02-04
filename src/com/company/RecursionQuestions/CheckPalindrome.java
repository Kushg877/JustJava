package com.company.RecursionQuestions;

public class CheckPalindrome {
    public static void main(String[] args) {
        String s= "geeg";
        int start=0;
        int end=s.length()-1;
        boolean a= palin(s,start,end);
        System.out.println(a);
    }
    static boolean palin(String s,int start,int end){
        boolean a;
        if(start==end){
            return true;
        }
            if(s.charAt(start)!=s.charAt(end)) {
                return false;
            }
            if(start<end){
                return palin(s,++start,--end);
            }
            return true;
    }
}
