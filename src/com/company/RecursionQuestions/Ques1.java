package com.company.RecursionQuestions;

// Print name n times

import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name= in.next();
        int count=in.nextInt();
        print(name,1,count);
    }
    public static void print(String name,int i,int count){
        if(i>count){
            return;
        }
        System.out.println(name+" "+i);
        i++;
        print(name,i,count);

    }
}
