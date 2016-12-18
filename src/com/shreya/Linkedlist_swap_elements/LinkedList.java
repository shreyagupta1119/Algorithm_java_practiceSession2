package com.shreya.Linkedlist_swap_elements;

/**
 * Created by shreya on 4/10/16.
 */
class LinkedList{
    Node head;
    void swap(Node temp){
        if(temp==null)
            return;

        while(temp!=null &&temp.next!=null){
            int t=temp.data;
            temp.data=temp.next.data;
            temp.next.data=t;
            temp=temp.next.next;
        }
    }

    void push(int data){
        Node temp=head;
        if(head==null){
            head=new Node(data);
            return;
        }
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=new Node(data);
    }

    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }

    }

    public static void main(String args[]){
        LinkedList list=new LinkedList();
        list.head=new Node(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);
        list.swap(list.head);
        list.display();

    }
}
