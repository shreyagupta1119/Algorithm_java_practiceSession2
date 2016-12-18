package com.shreya.Modular_exponentiation;

/**
 * Created by shreya on 5/10/16.
 */
class Expression{

    void findResult(int x, int y, int z){
        int res=1;
        x=x%z;
        while(y>0){
            if(y%2!=0)
                res=(res*x)%z;
            y=y>>1;
            x=(x*x)%z;
        }
        System.out.println(res);
    }

    public static void main(String args[]){
        Expression ex=new Expression();
        ex.findResult(2,3,5);
    }

}
