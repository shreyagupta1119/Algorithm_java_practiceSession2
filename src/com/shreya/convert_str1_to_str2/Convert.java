package com.shreya.convert_str1_to_str2;

/**
 * Created by shreya on 6/10/16.
 */

import java.util.*;

class Convert{

    static int edit(String s1,String s2, int m , int n){

        if(m==0)
            return n;
        if(n==0)
            return m;
        if(s1.charAt(m-1)==s2.charAt(n-1)){
            return edit(s1,s2,m-1,n-1);
        }
        else
            return (1+Math.min(Math.min(edit(s1,s2,m,n-1),edit(s1,s2,m-1,n)),edit(s1,s2,m-1,n-1)));
    }

    public static void main(String args[]){
        String str1 = "sunday";
        String str2 = "saturday";

        System.out.println( edit( str1 , str2 , str1.length(), str2.length()) );

    }

}