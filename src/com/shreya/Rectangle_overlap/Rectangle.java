package com.shreya.Rectangle_overlap;

class Rectangle {

    void findOverlap(Point l1, Point r1,Point l2,Point r2 ){
        if(r1.x<l2.x||r2.x<l1.x||r1.y>l2.y||r2.y>l1.y)
            System.out.println("not overlap");
        else
            System.out.println("overlap");

    }

    public static void main(String args[]){
        Rectangle rc=new Rectangle();
        Point l1=new Point(0,10);
        Point r1=new Point(10,0);
        Point l2=new Point(5,5);
        Point r2=new Point(15,0);
        rc.findOverlap(l1,r1,l2,r2);
        Point l3=new Point(0,10);
        Point r3=new Point(10,0);
        Point l4=new Point(11,10);
        Point r4=new Point(15,0);
        rc.findOverlap(l3,r3,l4,r4);
    }
}

