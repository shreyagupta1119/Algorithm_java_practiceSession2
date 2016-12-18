package com.shreya.Count_ways_to_calculate_distance;

/**
 * Created by shreya on 12/10/16.
 */

class Count{
    int res;
    int calculateWays(int dist){
        if(dist==0)
            return 1;
        if(dist==1)
            return 1;
        if(dist==2)
            return 2;
        return (calculateWays(dist-1)+calculateWays(dist-2)+calculateWays(dist-3));
    }

    public static void main(String args[]){
        Count c=new Count();
        System.out.println(c.calculateWays(0));
        System.out.println(c.calculateWays(1));
        System.out.println(c.calculateWays(2));
        System.out.println(c.calculateWays(3));
        System.out.println(c.calculateWays(4));
        System.out.println(c.calculateWays(5));
        System.out.println(c.calculateWays(6));
        System.out.println(c.calculateWays(7));
    }

}