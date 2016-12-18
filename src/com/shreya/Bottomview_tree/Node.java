package com.shreya.Bottomview_tree;

/**
 * Created by shreya on 12/10/16.
 */
class Node{
    int data;
    int hd;
    Node left,right;

    Node(int d){
        data=d;
        hd=Integer.MAX_VALUE;
        left=right=null;
    }
}
