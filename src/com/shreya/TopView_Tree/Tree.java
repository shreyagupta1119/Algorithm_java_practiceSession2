package com.shreya.TopView_Tree;
import java.util.*;
class Tree{

    void topView(Node temp){

        Queue<Node> queue=new LinkedList<Node>();

        HashSet<Integer> set=new HashSet<Integer>();
        if(temp==null)
            return;

        temp.hd=0;
        queue.add(temp);

        while(!queue.isEmpty()){
            Node t=queue.remove();
            int hd=t.hd;

            if(!set.contains(hd)){
                set.add(hd);
                System.out.print(t.data+" ");
            }

            if(t.left!=null){
                queue.add(t.left);
                t.left.hd=hd-1;
            }

            if(t.right!=null){
                queue.add(t.right);
                t.right.hd=hd+1;
            }

        }
    }
    public static void main(String[] args)
    {
        /* Create following Binary Tree
             1
           /  \
          2    3
           \
            4
             \
              5
               \
                6*/
        Tree tree=new Tree();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.left.right.right = new Node(5);
        root.left.right.right.right = new Node(6);

        System.out.println("Following are nodes in top view of Binary Tree");
        tree.topView(root);
    }
}

