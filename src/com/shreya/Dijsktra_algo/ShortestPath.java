package com.shreya.Dijsktra_algo;

/**
 * Created by shreya on 6/10/16.
 */

import java.util.*;
class ShortestPath{

    static final int v=9;

    int min(int[] dist, boolean[] flag){
        int res=-1;
        int value=Integer.MAX_VALUE;
        for(int i=0;i<v;i++){
            if(flag[i]==false &&dist[i]<value){
                value=dist[i];
                res=i;
            }
        }
        return res;
    }

    void dijkstra(int[][] graph, int src){
        int[] dist=new int[v];
        for(int i=0;i<v;i++)
            dist[i]=Integer.MAX_VALUE;
        dist[src]=0;
        boolean[] flag=new boolean[v];
        for(int i=0;i<v-1;i++){
            int u=min(dist,flag);
            flag[u]=true;
            for(int j=0;j<v;j++){
                if(graph[u][j]!=0 && !flag[j] && dist[j]>dist[u]+graph[u][j])
                    dist[j]=dist[u]+graph[u][j];
            }
        }

        System.out.println("Vertex   Distance from Source");
        for (int i = 0; i < v; i++)
            System.out.println(i+" \t\t "+dist[i]);

    }
    public static void main (String[] args){
        /* Let us create the example graph discussed above */
        int graph[][] = new int[][]{{0, 4, 0, 0, 0, 0, 0, 8, 0},
                {4, 0, 8, 0, 0, 0, 0, 11, 0},
                {0, 8, 0, 7, 0, 4, 0, 0, 2},
                {0, 0, 7, 0, 9, 14, 0, 0, 0},
                {0, 0, 0, 9, 0, 10, 0, 0, 0},
                {0, 0, 4, 14, 10, 0, 2, 0, 0},
                {0, 0, 0, 0, 0, 2, 0, 1, 6},
                {8, 11, 0, 0, 0, 0, 1, 0, 7},
                {0, 0, 2, 0, 0, 0, 6, 7, 0}
        };
        ShortestPath t = new ShortestPath();
        t.dijkstra(graph, 0);
    }
}