package com.shreya.array_is_preordertraversal_of_binary_tree;

/**
 * Created by shreya on 6/10/16.
 */
class BinaryTree{

    boolean isPre(int[] a, int start, int end){
        if(start>end)
            return true;
        int root=a[start];
        int i;
        for(i=start+1;i<=end;i++){
            if(a[i]>root){
                break;
            }
        }
        System.out.println(i);
        for(int j=i+1;j<=end;j++){
            if(a[j]<root)
                return false;
        }
        boolean l=isPre(a,start+1,i-1);
        boolean r=isPre(a,i,end);

        return l&r;
    }


    public static void main(String args[]){
        int a[]={40,30,35,80,100};
        BinaryTree bt=new BinaryTree();
        int n=a.length;
        boolean flag=bt.isPre(a,0,n-1);
        System.out.println(flag);
    }
}
