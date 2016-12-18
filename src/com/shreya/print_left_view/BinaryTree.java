package com.shreya.print_left_view;

/**
 * Created by shreya on 4/10/16.
 */
public class BinaryTree {
    Node root;
    static int curr_level=0;
    void findLeftView(Node temp, int level){
        if(temp==null)
            return;
        if (curr_level<level){
            System.out.println(temp.data);
            curr_level=level;
        }
        findLeftView(temp.left,level+1);
        findLeftView(temp.right,level+1);
    }

    public static void main(String args[]){
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(12);
        tree.root.left = new Node(10);
        tree.root.right = new Node(30);
        tree.root.right.left = new Node(25);
        tree.root.right.right = new Node(40);
        tree.findLeftView(tree.root,1);
    }
}
