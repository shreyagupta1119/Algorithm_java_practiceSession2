package com.shreya.inpre;

public class BuildTree {

    static int index=0;
    
    
    
    public Node solu(char in[], char pre[], int start,int end){
        Node temp;
        if(start>end)
        return null;
        temp=new Node(pre[index++]);
        if(start==end)
        return temp;
        int i=searchIndex(in,start,end,temp.data);
        
        temp.left=solu(in,pre,start,i-1);
        temp.right=solu(in,pre,i+1,end);
        return temp;
        
    }
    
    int searchIndex(char[] in, int start, int end, char value){
        int i;
        for(i=start;i<=end;i++){
            if(in[i]==value){
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
    
   public static void main(String args[]) {
        System.out.println("Main Started");
        BuildTree tree = new BuildTree();
        char in[] = new char[]{'D', 'B', 'E', 'A', 'F', 'C'};
        char pre[] = new char[]{'A', 'B', 'D', 'E', 'C', 'F'};
        int len = in.length;
        Node root = tree.solu(in, pre, 0, len - 1);
        System.out.println("inorder traversal");
        tree.inOrder(root);
    }
}
