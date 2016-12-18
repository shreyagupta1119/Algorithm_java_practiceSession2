package com.shreya.HeapSort;

/**
 * Created by shreya on 14/10/16.
 */

class HeapSort{

    void sort(int a[]){
        int n=a.length;

        for(int i=n/2-1;i>=0;i--)
            heapify(a,n,i);

        for(int i=n-1;i>=0;i--){
            int temp=a[i];
            a[i]=a[0];
            a[0]=temp;

            heapify(a,i,0);
        }


    }

    void heapify(int[] a, int n,int i){
        int largest=i;
        int left=2*i+1;
        int right=2*i+2;

        if(left<n &&a[left]>a[largest]){
            largest=left;
        }

        if(right<n &&a[right]>a[largest]){
            largest=right;
        }

        if(largest!=i){
            int swap=a[i];
            a[i]=a[largest];
            a[largest]=swap;

            heapify(a,n,largest);
        }
    }

    public static void main(String args[])
    {
        int arr[] = {12, 11, 13, 5, 6, 7};
        int n = arr.length;

        HeapSort ob = new HeapSort();
        ob.sort(arr);

        System.out.println("Sorted array is");
        for(int i=0;i<n;i++)
            System.out.println(arr[i]);
    }
}