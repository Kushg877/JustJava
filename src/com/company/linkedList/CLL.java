package com.company.linkedList;

public class CLL {
    private Node head;
    private Node tail;
    public int size;

    private class Node{
        private int val;
        private Node next;

        public Node(int val){
            this.val=val;
        }
        public Node(int val, Node next){
            this.val=val;
            this.next=next;
        }
    }

    public void insert(int val){
        Node node = new Node(val);
        if(head==null){
            head=node;
            head.next=head;
            tail=head;
            size++;
            return;
        }
        tail.next=node;
        node.next=head;
        tail=node;
        size++;
    }

    public void delete(int val){
        Node node=head;
        if(node==null){
            return;
        }
        if(node.val==val){
            tail.next=head.next;
            head=head.next;
            size--;
            return;
        }
        do{
            Node n=node.next;
            if(n.val==val){
                node.next=n.next;
                size--;
                break;
            }
            node=node.next;
        }while(node!=head);
    }

    public void display(){
        Node temp=head;
        do {
            System.out.print(temp.val+"->");
            temp=temp.next;
        }while(temp!=head);
        System.out.println("HEAD");
    }
}
