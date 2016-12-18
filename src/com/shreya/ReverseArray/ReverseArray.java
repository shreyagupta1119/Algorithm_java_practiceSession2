package com.shreya.ReverseArray;

/**
 * Created by shreya on 4/10/16.
 */
class ReverseArray{

    void reverseArray(int[] a, int start, int end){
        if(start<end){
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            reverseArray(a,start+1,end-1);
        }
    }

    public static void main(String args[]){
        ReverseArray obj=new ReverseArray();
        int[] a={1,2,3,4,5,6,7};
        int n=a.length;
        obj.reverseArray(a,0,n-1);
        for(int i:a)
            System.out.println(i);
    }
}
