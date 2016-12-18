package com.shreya.Bottomview_tree;
import java.util.*;
import java.util.Map.Entry;
/**
 * Created by shreya on 12/10/16.
 */
class Tree{

    public void bottomView(Node temp){
        if(temp==null)
            return;

        temp.hd=0;

        Map<Integer,Integer> map=new TreeMap<Integer,Integer>();

        Queue<Node> queue=new LinkedList<Node>();

        queue.add(temp);

        while(!queue.isEmpty()){

            Node t=queue.remove();
            int hd=t.hd;
            map.put(hd,t.data);

            if(t.left!=null){
                t.left.hd=hd-1;
                queue.add(t.left);
            }

            if(t.right!=null){
                t.right.hd=hd+1;
                queue.add(t.right);
            }
        }

        // Extract the entries of map into a set to traverse
        // an iterator over that.
        Set<Entry<Integer, Integer>> set = map.entrySet();

        // Make an iterator
        Iterator<Entry<Integer, Integer>> iterator = set.iterator();

        // Traverse the map elements using the iterator.
        while (iterator.hasNext())
        {
            Map.Entry<Integer, Integer> me = iterator.next();
            System.out.print(me.getValue()+" ");
        }

    }
    public static void main(String[] args)
    {
        Tree tree=new Tree();
        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(22);
        root.left.left = new Node(5);
        root.left.right = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(25);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);
        System.out.println("Bottom view of the given binary tree:");
        tree.bottomView(root);
    }

}
