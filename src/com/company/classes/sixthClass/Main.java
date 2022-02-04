package com.company.classes.sixthClass;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(4);
//        list.toString();
        list.remove();
//        list.toString();
        list.add(5);
//        list.toString();
        list.get(2);
        list.set(0,1);
//        list.toString();
        list.remove();
        list.set(4,5);
        list.set(1,2);
        list.set(3,4);
//        list.toString();
        System.out.println(list);

        ArrayList list2 =new ArrayList();
        list2.add("sasa");
        list2.add(5);
        list2.add(15151/8f);
        System.out.println(list2);
        String a = (String) list2.get(0);
        System.out.println(a);

    }
}
