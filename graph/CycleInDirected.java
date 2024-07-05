package com.dsa.randomquesgenerator.graph;

import java.util.ArrayList;

public class CycleInDirected {

    public static void main(String args[]){

        // acyclic directed
        int ar[][] = {{0,1},{0,2},{1,3},{2,3}};
        int v = 4;

        // cyclic directed
        int ar1[][] = {{1,0},{0,2},{2,3},{3,0}};
        int v1 = 4;


        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<v;i++)adj.add(new ArrayList<Integer>());

        for(int i=0;i<ar.length;i++){
            adj.get(ar[i][0]).add(ar[i][1]);
        }

        ArrayList<ArrayList<Integer>> adj1 = new ArrayList<>();
        for(int i=0;i<v1;i++)adj1.add(new ArrayList<>());
        for(int i=0;i<ar1.length;i++){
            adj1.get(ar1[i][0]).add(ar[i][1]);
        }

        System.out.println("Is Cyclic "+isCyclic(adj));

        System.out.println("Is Cyclic "+isCyclic(adj1));

    }

    public static boolean isCyclic(ArrayList<ArrayList<Integer>> adj){

        int visit[] = new int[adj.size()];
        int recs[] = new int[adj.size()];

        for(int i=0;i<visit.length;i++){
            if(visit[i] == 0){
             if(dfs(adj, visit, recs, i)) return true;
            }
        }

        return false;
    }

    public static boolean dfs(ArrayList<ArrayList<Integer>> adj, int[] visit, int[] recs, int v){

        visit[v] = 1;
        recs[v] = 1;

        for(int n:adj.get(v)){
            if(visit[n] == 0){
                if(dfs(adj,visit,recs,n))return true;
            }
            else{
                if(recs[n] == 1)return true;
            }

        }

        recs[v] = 0;
        return false;
    }


}
