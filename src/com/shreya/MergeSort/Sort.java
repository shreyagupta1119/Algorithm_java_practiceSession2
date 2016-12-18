package com.shreya.MergeSort;

/**
 * Created by shreya on 14/10/16.
 */

class Sort{

    void mergeSort(int[] a, int start, int end){
        if(start<end){
            int mid=(end+start)/2;
            mergeSort(a,start,mid);
            mergeSort(a, mid+1,end);

            merge(a,start,mid,end);
        }
    }

    void merge(int[] a, int start, int mid, int end){
        int n1=mid-start+1;
        int n2=end-mid;

        int a1[]=new int[n1];
        int a2[]=new int[n2];

        for(int i=0;i<n1;i++){
            a1[i]=a[start+i];
        }
        for(int i=0;i<n2;i++){
            a2[i]=a[mid+1+i];
        }

        int i=0,j=0;
        int k=start;
        while(i<n1 &&j<n2){
            if(a1[i]<a2[j]){

                i++;
            }
            else{
                a[k]=a2[j];
                j++;
            }
            k++;

        }
        while(i<n1){
            a[k]=a1[i];
            i++;
            k++;
        }
        while(j<n2){
            a[k]=a2[j];
            j++;
            k++;
        }

    }

    void printArray(int[] a){
        for(int i=0;i<a.length;i++)
            System.out.println(a[i]);
    }
    public static void main(String args[])
    {
        int arr[] = {12, 11, 13, 5, 6, 7};
        Sort ob = new Sort();
        System.out.println("Given Array");
        ob.printArray(arr);


        ob.mergeSort(arr, 0, arr.length-1);

        System.out.println("\nSorted array");
        ob.printArray(arr);
    }

}