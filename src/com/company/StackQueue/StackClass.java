package com.company.StackQueue;

import java.util.ArrayList;

public class StackClass {

//    ****STACK USING LL****

    private Node head;
    private class Node{
        private int val;
        private Node next;

        public Node(int val){
            this.val=val;
            this.next=null;
        }
    }

    public boolean isEmpty(){
        return head==null;
    }

    public void push(int val){
        Node node= new Node(val);
        if(isEmpty()){
            System.out.println("It was empty ans now added");
            head=node;
            return;
        }
        node.next=head;
        head=node;
    }

    public int peek(){
        if(this.isEmpty()){
            return -1;
        }
        return head.val;
    }

    public int pop(){
        if(this.isEmpty()){
            return -1;
        }
        int top=head.val;
        head=head.next;
        return top;
    }

    public void display(){
        if(head==null){
            System.out.println("Empty stack");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("Finished");
    }


//    ****STACK USING ARRAYLIST****

    ArrayList<Integer> list = new ArrayList<>();
    public boolean isEmpty1(){
        return list.size()==0;
    }
    public void push1(int val){
        list.add(val);
    }
    public int peek1(){
        return list.get(list.size()-1);
    }
    public int pop1(){
        int top=list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;
    }
}
