package com.shreya.Prim_minimum_spanning_tree;

/**
 * Created by shreya on 6/10/16.
 */
import java.util.*;

class MST{
    static final int v=5;
    void primTree(int[][] graph){
        int[] key=new int[v];
        boolean flag[]=new boolean[v];

        for(int i=0;i<v;i++){
            key[i]=Integer.MAX_VALUE;
        }

        int[] parent=new int[v];
        key[0]=0;
        parent[0]=-1;

        for(int i=0;i<v-1;i++){
            int u=min(key,flag);

            flag[u]=true;

            for(int j=0;j<v;j++){
                if(!flag[j] && graph[u][j]!=0 && key[j]>graph[u][j]){
                    parent[j]=u;
                    key[j]=graph[u][j];

                }
            }
        }

        System.out.println("Edge   Weight");
        for (int i = 1; i < v; i++)
            System.out.println(parent[i]+" - "+ i+"    "+
                    graph[i][parent[i]]);

    }

    int min(int key[], boolean flag[])
    {
        // Initialize min value
        int value = Integer.MAX_VALUE, res=-1;

        for (int i= 0; i < v; i++)
            if (flag[i] == false && key[i] < value)
            {
                value = key[i];
                res= i;
            }

        return res;
    }

    public static void main(String args[]){
        MST t = new MST();
        int graph[][] = new int[][] {{0, 2, 0, 6, 0},
                {2, 0, 3, 8, 5},
                {0, 3, 0, 0, 7},
                {6, 8, 0, 0, 9},
                {0, 5, 7, 9, 0},
        };

        t.primTree(graph);
    }
}
