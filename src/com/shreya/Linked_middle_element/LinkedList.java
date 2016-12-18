package com.shreya.Linked_middle_element;

class LinkedList{
    Node head;

    void findMid(){
        if(head==null)
            return;
        Node i=head,j=head;
        while(j!=null&&j.next!=null){
            j=j.next.next;
            i=i.next;
        }

        System.out.println(i.data);


    }

    public static void main(String args[]){
        LinkedList list=new LinkedList();
        list.head=new Node(1);
        list.head.next=new Node(2);
        list.head.next.next=new Node(3);
        list.head.next.next.next=new Node(4);
        list.findMid();
    }
}
