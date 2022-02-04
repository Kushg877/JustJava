package com.company.linkedList;

public class DLL {
    private Node head;
    private Node tail;
    public int size;

    private class Node{
        private int val;
        private Node next;
        private Node prev;

        public Node(int val){
            this.val=val;
        }
        public Node(int val,Node next,Node prev){
            this.val=val;
            this.next=next;
            this.prev=prev;
        }
    }

    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        if(head!=null){
            head.prev=node;
        }
        head=node;
        if(tail==null){
            tail=head;
        }
        size++;
    }

    public void insertLast(int val){
        Node node = new Node(val);
        if(tail!=null){
            tail.next=node;
        }
        node.prev=tail;
        tail=node;
        if(head==null){
            head=tail;
        }
        size++;
    }

    public void insert(int val,int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }

        Node node = get(index-1);
        Node temp=new Node(val);
        temp.next=node.next;
        node.next.prev=temp;
        node.next=temp;
        temp.prev=node;
        size++;

    }

    public Node get(int index){
        Node node=head;
        for(int i=0;i<index;i++){
            node=node.next;
        }
        return node;
    }

    public void display(){
        Node node=head;
        while(node!=null){
            System.out.print(node.val+"->");
            node=node.next;
        }
        System.out.println("END");
    }

    public void displayRev(){
        Node node=tail;
        while(node!=null){
            System.out.print(node.val+"->");
            node=node.prev;
        }
        System.out.println("END");
    }
}
