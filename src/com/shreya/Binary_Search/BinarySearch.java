package com.shreya.Binary_Search;

class BinarySearch{

    boolean find(int[] a,int x, int start, int end){
        if(start>end)
            return false;
        if(start==end){
            if(a[start]==x){
                return true;
            }
        }
        int mid=(end+start)/2;

        if(a[mid]>x)
            return find(a,x,start,mid-1);

        return find(a,x,mid+1,end);
    }

    public static void main(String args[]){
        BinarySearch bs=new BinarySearch();
        int[] a={1,2,3,4,5,6};
        int n=a.length;
        boolean flag=bs.find(a,2,0,n-1);
        System.out.println(flag);
    }

}