package com.dsa.randomquesgenerator.graph;

import java.util.ArrayList;

public class CycleInUndirected {

    public static void main(String args[]){

        //acyclic input
        int ar[][] = {{0,1},{0,3},{1,0},{2,3},{3,0},{3,2},{1,2},{2,1}};
        int v = 4;

        //cyclic input
        int ar1[][] = {{0,1},{0,3},{1,0},{2,3},{2,4},{3,0},{3,2},{3,4},{4,2},{4,3}};
        int v1 = 5;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<v;i++)adj.add(new ArrayList<Integer>());

        for(int i=0;i<ar.length;i++){
            adj.get(ar[i][0]).add(ar[i][1]);
        }


        ArrayList<ArrayList<Integer>> adj1 = new ArrayList<>();
        for(int i=0;i<v1;i++)adj1.add(new ArrayList<Integer>());
        for(int i=0;i<ar1.length;i++){

            adj1.get(ar1[i][0]).add(ar1[i][1]);
        }

        System.out.println("Is Cyclic == "+ isCyclic(adj));

        System.out.println("Is Cyclic == "+ isCyclic(adj1));


    }

    public static boolean isCyclic(ArrayList<ArrayList<Integer>> adj){

        int[] visit = new int[adj.size()];

        for(int i=0;i<visit.length;i++){
            if(visit[i] == 0){
                if(dfs(visit, i,-1, adj))return true;
            }
        }
        return false;
    }

    public static boolean dfs(int[] visit, int v, int p, ArrayList<ArrayList<Integer>> adj){
        visit[v] = 1;
        for(int n: adj.get(v)){
            if(visit[n] == 0){
                if(dfs(visit, n, v, adj)) return true;
            }
            else{
                if(p!=n){
                    //System.out.println(p+"   "+n+"  "+v);
                    return true;
                }
            }

        }
        return false;
    }
}
