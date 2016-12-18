package com.shreya.FloydWarshall_algo;

/**
 * Created by shreya on 13/10/16.
 */
class Graph{
    final static int INF = 99999;
    void floydWarshal(int[][] a){
        int v=a.length;
        int[][] res=new int[v][v];
        for(int i=0;i<v;i++){
            for(int j=0;j<v;j++){
                res[i][j]=a[i][j];
            }
        }

        for (int k=0;k<v;k++){
            for(int i=0;i<v;i++){
                for(int j=0;j<v;j++){
                    if(res[i][k]+res[k][j]<res[i][j]){
                        res[i][j]=res[i][k]+res[k][j];
                    }
                }
            }
        }
        print(res);
    }

    void print(int[][] a){
        int v=a.length;
        for(int i=0;i<v;i++){
            for(int j=0;j<v;j++){
                if(a[i][j]==99999)
                    System.out.print("INF" + " ");
                else
                    System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main (String[] args)
    {
        /* Let us create the following weighted graph
           10
        (0)------->(3)
        |         /|\
        5 |          |
        |          | 1
        \|/         |
        (1)------->(2)
           3           */
        int graph[][] = { {0,   5,  INF, 10},
                {INF, 0,   3, INF},
                {INF, INF, 0,   1},
                {INF, INF, INF, 0}
        };
        Graph g = new Graph();

        // Print the solution
        g.floydWarshal(graph);

    }

}
