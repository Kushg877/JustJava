package com.company.CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayLists {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //ArrayList is always made up of objects and not primitives so to make array list of integer we use Wrapper Class.
        ArrayList<Integer> list = new ArrayList<>(); //----> Here "list" is an object;
//        ArrayList<Integer> list1 = new ArrayList<Integer>(); //-->Can also be defined like this
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        //Replacing value at 0th index with 99
        list.set(0,99);

        System.out.println(list.remove(1));
        System.out.println(list);

        //input
//        for (int i = 0; i < 5; i++) {
//            list.add(in.nextInt());
//        }
//
//        //output
//        for (int i = 0; i < 5; i++) {
//            System.out.println(list.get(i));// list[index] syntax will not work here
//        }
    }
}
