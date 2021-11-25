package com.company.notes;

import java.util.Scanner;

public class handsOnPractice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String s = in.next();
//        String s ="kush";
//        int arr=123;
//        System.out.println(Arrays.toString());
//        int number1 = 123;
//        String str1 = Integer.toString(number1);
//        System.out.println(str1);
//        String str = "123";
//        int number = Integer.parseInt(str);
//        System.out.println(number);
//        System.out.println("Enter size of array");
//        int size = in.nextInt();
//        String[] s = new String[size];
//        String a = "";
//        for (int i = 0; i < size; i++) {
//            a += in.next();
//        }
//        System.out.println(a.length());
//        System.out.print("Enter String: ");
//        String str = in.next();
//        String result = "";
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == '@') {
//                break;
//            }
//            else{
//                result += str.charAt(i);
//            }
//        }
//        System.out.println(result);
//        String s = "Kush";
//        System.out.println(Arrays.toString(s.toCharArray()));
//        String a = "Kush Garg";
//        System.out.println(Arrays.toString(a.toCharArray()));

        A obj;
        for(int i=0;i<1000000000;i++){
            obj = new A();
        }

    }
}
class A{
    int rno = 4;


    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}