package com.company.classes.sixthClass;

import com.company.introduction.Array;

import java.util.Arrays;

public class CustomArrayList {
    private int[] data=new int[1];
//    private int Default_Value=10;
    private int size=0;

    public void add(int element){
        if(isFull()){
            resize();
        }
        data[size++] = element;
    }

    public boolean isFull(){
        return size== data.length;
    }

    public void resize(){
        int[] temp=new int[data.length+1];
        for (int i = 0; i < data.length; i++) {
            temp[i]=data[i];
        }
        data=temp;
    }
    public void remove(){
        int[] temp=new int[--size];
        for (int i = 0; i < size; i++) {
            temp[i]=data[i];
        }
        data=temp;
//        int removed =data[--size];
//        --size;

    }



    public int Size(){
        return size;
    }

    public void get(int index){
        System.out.println(data[index]);
    }

    public void set(int index ,int element){
        data[index]=element;
    }

    @Override
    public String toString(){
        return (Arrays.toString(data));
    }
}
