package com.shreya.IS_Binary_tree_full;

/**
 * Created by shreya on 6/10/16.
 */
class BinaryTree{
    Node root;
    boolean isFullTree(Node temp) {
        if(temp==null)
            return true;
        if((temp.left==null &&temp.right!=null)||(temp.right==null &&temp.left!=null))
            return false;
        boolean l=isFullTree(temp.left);
        boolean r=isFullTree(temp.right);

        return l&r;
    }


    public static void main(String args[])
    {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(10);
        tree.root.left = new Node(20);
        tree.root.right = new Node(30);
        tree.root.left.right = new Node(40);
        tree.root.left.left = new Node(50);
        tree.root.right.left = new Node(60);
        tree.root.left.left.left = new Node(80);
        tree.root.right.right = new Node(70);
        tree.root.left.left.right = new Node(90);
        tree.root.left.right.left = new Node(80);
        tree.root.left.right.right = new Node(90);
        tree.root.right.left.left = new Node(80);
        tree.root.right.left.right = new Node(90);
        tree.root.right.right.left = new Node(80);
        tree.root.right.right.right = new Node(90);

        if(tree.isFullTree(tree.root))
            System.out.print("The binary tree is full");
        else
            System.out.print("The binary tree is not full");
    }
}

