package com.company.RecursionQuestions;

public class Triangle1 {
    public static void main(String[] args) {
        printTriangle3(4,0);
        System.out.println();
        printTriangle2(4,0);
    }

    static void printTriangle(int r){
        if(r<1){
            return;
        }
        printRow(r);
        printTriangle(r-1);
    }
    static void printTriangle2(int r,int i){
        if(r<1){
            return;
        }
        printRow(++i);
        printTriangle2(r-1,i);
    }
    static void printRow(int c){
        if(c<1){
            System.out.println();
            return;
        }
        System.out.print("*"+" ");
        printRow(--c);
    }

    static void printTriangle3(int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            System.out.print("*");
            printTriangle3(r,c+1);
        }
        else{
            System.out.println();
            printTriangle3(r-1,0);
        }
    }

}
