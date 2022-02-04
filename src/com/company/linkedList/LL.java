package com.company.linkedList;

public class LL {
    private Node head;
    private Node tail;
    public int size;

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value=value;
        }
        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
    }

    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;  // because if we are inserting at first position,it should point the then first node which means the then head
        head=node; // now update head to new first position node
        if(tail==null){
            tail=head;
        }
        size++;
    }

    public void insertLast(int val){
        Node node=new Node(val);
        if(tail==null){
            tail=node;
            head=tail;
            return;
        }
        tail.next=node;
        tail=node;
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
        Node temp=head;
        while(index>1){
            temp=temp.next;
            index--;
        }
        Node node=new Node(val);
        node.next=temp.next;
        temp.next=node;
        size++;
    }

    public int deleteFirst(){
        int val = head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }

    public int deleteLast(){
        Node temp=head;
        while(temp.next!=tail){
            temp=temp.next;
        }
        int val=temp.next.value;
        temp.next=null;
        tail=temp;
        size--;
        return val;
    }

    public void delete(int index){
        if(index==0){
            deleteFirst();
            return;
        }
        if(index==size-1){
            deleteLast();
            return;
        }
        Node temp=head;

//        ***first Method***

//        while(index>1){
//            temp=temp.next;
//            index--;
//        }

//        ***Second Method***

        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
    }


//    ***To get the pointer at particular node of given index***
    public Node get(int index){
        Node temp =head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp;
    }

//    *** To return the pointer at particular node whose value is given***
    public Node find(int value){
        Node temp=head;
        while(temp!=null){
            if(temp.value==value){
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println("END");
    }

}
