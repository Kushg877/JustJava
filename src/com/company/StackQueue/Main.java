package com.company.StackQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        System.out.print(stack.push(1));
//        System.out.println(stack.push(2));
//        System.out.println(stack.pop());
//
//        Queue<Integer> queue = new LinkedList<>();//Since queue is an interface we cannot create its object so we ujse linked list since linkedlist implements dequeue and dequeue(another interface) extends queue
//        System.out.println(queue.add(30));  // returns boolean
//        queue.add(40);
//        queue.add(50);
//        queue.add(60);
//        queue.add(70);
//
//        System.out.println(queue.remove());

        StackClass stack =new StackClass();
//        stack.display();
        stack.push(5);
//        stack.display();
        stack.push(6);
//        stack.display();
        System.out.println(stack.peek());
//        StackClass stack1=new StackClass();
//        System.out.println(stack1.peek());
        stack.display();
        stack.pop();
        stack.display();
//        System.out.println(stack.peek());
//        stack.pop();
//        System.out.println(stack.peek());
    }
}
