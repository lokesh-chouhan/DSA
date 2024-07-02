package com.dsa.randomquesgenerator.graph;

import java.util.ArrayList;

public class DFS {
    
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> adj = Representation.getGraph();
        dfsDemo(adj);
    }

    public static void dfsDemo(ArrayList<ArrayList<Integer>> adj){
        int visit[] = new int[adj.size()];
        dfs(adj, visit, 0);
    }

    public static void dfs(ArrayList<ArrayList<Integer>> adj, int visit[], int v){
        visit[v] = 1;
        System.out.println(v);
        for(int j: adj.get(v)){
            if(visit[j] == 0){
                dfs(adj, visit, j);
            }
        }
    }
}
