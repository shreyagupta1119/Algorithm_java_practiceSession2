package com.shreya.is_array_subset_equals_sum;

/**
 * Created by shreya on 14/10/16.
 */
class SubsetSum{

    boolean isSubset(int[] a, int n, int sum){
        if(sum==0)
            return true;
        if(n==0 && sum!=0)
            return false;
        if(a[n-1]>sum)
            return isSubset(a,n-1,sum);
        return (isSubset(a,n-1,sum) || isSubset(a,n-1,sum-a[n-1]));

    }

    public static void main(String args[]){
        SubsetSum obj=new SubsetSum();
        int[] a={3,7,6,1,2};
        System.out.println(obj.isSubset(a,5,4));

    }
}
