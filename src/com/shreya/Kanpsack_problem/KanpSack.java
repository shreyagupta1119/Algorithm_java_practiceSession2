package com.shreya.Kanpsack_problem;

/**
 * Created by shreya on 15/10/16.
 */

import java.util.*;
import java.lang.*;
class KnapSack{
    int max(int a,int b){
        return a>b? a: b;
    }

    int calculate(int[] v, int[] w, int W, int n){

        if(W==0)
            return 0;
        if(n==0)
            return 0;
        if(w[n-1]>W)
            return calculate(v,w,W,n-1);
        return max(calculate(v,w,W,n-1),v[n-1]+calculate(v,w,W-w[n-1],n-1));
    }

    public static void main(String args[]){
        int val[] = new int[]{60, 100, 120};
        int wt[] = new int[]{10, 20, 30};
        int  W = 50;
        int n = val.length;
        KnapSack obj=new KnapSack();
        System.out.println(obj.calculate(val,wt,W, n));

    }
}