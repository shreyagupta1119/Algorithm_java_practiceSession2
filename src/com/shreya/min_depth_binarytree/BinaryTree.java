package com.shreya.min_depth_binarytree;

/**
 * Created by shreya on 5/10/16.
 */

class BinaryTree{
    Node root;
    static int h=0;

    int findDepth(Node temp){
        if(temp==null)
            return 0;
        if(temp.left==null)
            return findDepth(temp.right)+1;
        else if(temp.right==null)
            return findDepth(temp.left)+1;
        else
            return Math.min(findDepth(temp.left),findDepth(temp.right))+1;
    }

    public static void main(String args[])
    {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left=new Node(6);

        System.out.println("The minimum depth of "+
                "binary tree is : " + tree.findDepth(tree.root));
    }
}