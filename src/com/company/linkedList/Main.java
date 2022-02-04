package com.company.linkedList;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {


//        ***** SINGLY LINKED LIST*****

//        LL list = new LL();
//        list.insertFirst(5);
//        list.insertFirst(6);
//        list.insertFirst(7);
//        list.insertFirst(8);
//        list.insertFirst(9);
//
//         list.insertLast(4);
//        list.insertLast(3);
//        list.insertLast(2);
//        list.insertLast(1);
//
//        list.insert(54,1);
//        list.insert(10,9);
//
//        list.display();
//        System.out.println(list.size);

//        list.deleteFirst();
//        list.display();
//
//        list.deleteLast();
//        list.display();
//
//        list.delete(4);
//        list.display();

//        ******* DOUBLY LINKED LIST*******

//        DLL list1 = new DLL();
//        list1.insertFirst(5);
//        list1.insertFirst(4);
//        list1.insertFirst(3);
//        list1.insertFirst(2);
//        list1.insertFirst(1);
//
//        list1.insertLast(6);
//        list1.insertLast(7);
//        list1.insertLast(8);
//        list1.insertLast(9);
//        list1.insertLast(10);
//
//        list1.display();
//
//        list1.insert(54,5);

        CLL list2=new CLL();
        list2.insert(5);;
        list2.insert(6);
        list2.display();
        System.out.println(list2.size);
        list2.delete(6);
        list2.display();
        System.out.println(list2.size);


    }
}
