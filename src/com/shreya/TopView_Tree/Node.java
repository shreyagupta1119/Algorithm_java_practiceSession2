package com.shreya.TopView_Tree;

/**
 * Created by shreya on 12/10/16.
 */

class Node{
    int data;
    Node left,right;
    int hd;

    Node(int d){
        data=d;
        left=right=null;
        hd=Integer.MAX_VALUE;
    }
}