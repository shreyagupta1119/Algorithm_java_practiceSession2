package com.shreya.implement_stack_using_queue;


import java.util.*;

class Stack{
    Queue<Integer> q1=new LinkedList<Integer>();
    Queue<Integer> q2=new LinkedList<Integer>();
    void push(int data){
        q1.add(data);
    }

    void pop(){
        if(q1.isEmpty()){
            System.out.println("stack is empty");
            return;
        }
        for(int i=q1.size();i>1;i--){
            q2.add(q1.remove());
        }
        System.out.println(q1.remove());
        for(int i=q2.size();i>0;i--){
            q1.add(q2.remove());
        }
    }

    public static void main(String args[]){

        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.pop();
        s.push(3);
        s.pop();
        s.pop();
        s.pop();

    }
}