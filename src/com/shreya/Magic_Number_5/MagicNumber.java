package com.shreya.Magic_Number_5;

/**
 * Created by shreya on 5/10/16.
 */

class MagicNumber{

    void findNumber(int n){
        String s=Integer.toString(n,2);

        int l=s.length();

        int a[]=new int[l];

        for(int i=0;i<l;i++){
            a[i]=s.charAt(i)-'0';
        }
        int pow=1;
        int value=0;
        for(int j=l-1;j>=0;j--){
            pow=pow*5;
            value+=(a[j]*pow);
        }
        System.out.println(value);
    }

    public static void main(String args[]){
        MagicNumber mn=new MagicNumber();
        mn.findNumber(6);
        mn.findNumber(5);
    }
}