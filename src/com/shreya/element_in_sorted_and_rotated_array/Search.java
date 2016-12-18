package com.shreya.element_in_sorted_and_rotated_array;


class Search{

    int find(int[] a,int x, int start, int end){
        if(start>end)
            return -1;
        int mid=(start+end)/2;
        if(start==end){
            if(a[start]!=x)
                return -1;
        }
        if(a[mid]==x)
            return mid;
        else if(a[start]<a[mid]){
            if(a[start]<=x &&x<=a[mid]){
                return find(a,x,start,mid);
            }
            else
                return find(a,x,mid+1,end);
        }

        else{
            if(a[mid+1]<=x &&x<=a[end])
                return find(a,x,mid+1,end);
            else
                return find(a,x,start,mid);


        }

    }


    public static void main(String args[]){
        Search s1=new Search();
        int[] a={2,3,4,5,1};
        int n=a.length;
        int flag=s1.find(a,6,0,n-1);
        System.out.println(flag);
    }


}