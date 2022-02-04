package com.company.StackQueue;

import java.util.Stack;

public class AddAtLast {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack();
        stack.add(4);
        stack.add(3);
        stack.add(2);
        stack.add(1);
        int n=5;
        Last(stack,n);
        System.out.println(stack);
    }
    static Stack<Integer> Last(Stack<Integer> stack, int n){
        if(stack.isEmpty()){
            stack.add(n);
            return stack;
        }
        int top=stack.pop();
        Last(stack, n);
        stack.add(top);
        return stack;
    }
}
