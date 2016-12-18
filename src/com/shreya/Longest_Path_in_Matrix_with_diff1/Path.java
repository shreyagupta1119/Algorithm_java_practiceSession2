package com.shreya.Longest_Path_in_Matrix_with_diff1;

/**
 * Created by shreya on 13/10/16.
 */

class Path{

    int findLongestPath(int[][] a){
        if(a==null)
            return 0;
        int length=Integer.MIN_VALUE;

        int m=a.length;
        System.out.println(m);
        int n=a[0].length;
        System.out.println(n);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                try{System.out.println(i+" "+j);
                    int count=1;
                    int x=i,y=j;
                    while(x<m &&y<n){
                        System.out.println("hello");
                        if( x+1 < m&& a[x][y]+1 ==a[x+1][y]){

                            ++count;
                            x++;
                            System.out.println("hello1");
                        }
                        else if( y+1<n && (a[x][y]+1==a[x][y+1])){

                            ++count;
                            y++;
                            System.out.println("hello2");
                        }
                        else if (x>=1 && a[x][y]+1==a[x-1][y]){

                            System.out.println("hello3");
                            ++count;
                            x--;
                        }
                        else if(y>=1 && a[x][y]+1==a[x][y-1]){

                            System.out.println("hello4");
                            ++count;
                            y--;
                        }
                        else
                            break;
                    }
                    System.out.println(count);
                    if(count>length)
                        length=count;
                }
                catch (Exception e){}
            }}
        return length;
    }

    public static void main(String args[]){
        Path obj=new Path();
        int a[][]={{1,2,9},{5,3,8},{4,6,7}};
        System.out.println(obj.findLongestPath(a));

    }
}