package com.company;

class ClassOne {
    static int i=111;
    int j=222;
    {
        i=i++-++j;
    }
}

class ClassTwo extends ClassOne{
    {
        j=i--+--j;
    }
}
class B{
    public static void main(String[] args) {
        ClassTwo ct= new ClassTwo();
        System.out.println(ct.j);
    }
}
