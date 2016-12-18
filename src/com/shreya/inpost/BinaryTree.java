package com.shreya.inpost;

class BinaryTree{

    static int index;

    Node buildTree(int[] in,int[] post,int start,int end){
        Node temp;
        if(start>end)
            return null;

        temp=new Node(post[--index]);
        if(start==end)
            return temp;

        int i=searchIndex(in,start,end,temp.data);
        temp.right=buildTree(in,post,i+1,end);
        temp.left=buildTree(in,post,start,i-1);
        return temp;
    }

    int searchIndex(int[] in,int start,int end,int value){
        int i;
        for(i=end;i>=start;i--){
            if(value==in[i]){
                return i;
            }
        }
        return i;
    }

    public void inOrder(Node temp){
        if(temp==null)
            return;
        inOrder(temp.left);
        System.out.println(temp.data);
        inOrder(temp.right);

    }

    public void preOrder(Node temp){
        if(temp==null)
            return;
        System.out.println(temp.data);
        preOrder(temp.left);
        preOrder(temp.right);

    }

    public static void main(String args[]){
        BinaryTree b=new BinaryTree();
        int in[] = new int[]{4, 8, 2, 5, 1, 6, 3, 7};
        int post[] = new int[]{8, 4, 5, 2, 6, 7, 3, 1};
        index = in.length;
        Node root=b.buildTree(in,post,0,index-1);
        System.out.println("inorder traversal");
        b.preOrder(root);

    }
}
