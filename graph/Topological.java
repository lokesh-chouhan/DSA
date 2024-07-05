package com.dsa.randomquesgenerator.graph;

import java.util.ArrayList;
import java.util.LinkedList;

public class Topological {
    public static void main(String args[]){

        // DAG - directed acyclic graph
        int ar[][] = {{0,2},{0,3},{1,4},{2,1},{2,3},{3,1},{5,1},{5,4}};
        int v=6;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<v;i++)adj.add(new ArrayList<>());
        for(int i=0;i<ar.length;i++){
            adj.get(ar[i][0]).add(ar[i][1]);
        }

        topologicalSort(adj);
    }

    public static void topologicalSort(ArrayList<ArrayList<Integer>> adj){

        int visit[] = new int[adj.size()];
        LinkedList<Integer> st = new LinkedList<>();

        for(int i=0;i<adj.size();i++){
            if(visit[i] == 0){
                dfs(adj,visit,i,st);
            }
        }

        while(!st.isEmpty()){
            System.out.print(st.removeFirst()+" ");
        }
    }

    public static void dfs(ArrayList<ArrayList<Integer>> adj, int visit[], int v, LinkedList s){

        visit[v] = 1;
        for(int n:adj.get(v)){
            if(visit[n] == 0){
                dfs(adj, visit, n, s);
            }
        }

        s.addFirst(v);
    }


}
