package com.dsa.randomquesgenerator.graph;

import java.util.ArrayList;
import java.util.LinkedList;

public class TopologicalKahn {

    public static void main(String args[]){

        // DAG - directed acyclic graph
        int ar[][] = {{0,2},{0,3},{1,4},{2,1},{2,3},{3,1},{5,1},{5,4}};
        int v=6;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<v;i++)adj.add(new ArrayList<>());
        for(int i=0;i<ar.length;i++){
            adj.get(ar[i][0]).add(ar[i][1]);
        }

        //topologicalSort(adj);
        kahn(adj);
    }

    public static void kahn(ArrayList<ArrayList<Integer>> adj){

        int visit[] = new int[adj.size()];
        int indeg[] = new int[adj.size()];
        LinkedList<Integer> q = new LinkedList<>();

        //Calculate indegree of each node
        for(ArrayList<Integer> list: adj){
            for(Integer i: list){
                indeg[i]++;
            }
        }

        //If indegree is 0, add to q
        for(int i=0;i<indeg.length;i++){
            if(indeg[i] == 0)q.addLast(i);
        }

        //
        while(!q.isEmpty()){
            int v = q.removeFirst();
            System.out.print(v+"  ");
            for(int n: adj.get(v)){
                indeg[n]--;
                if(indeg[n] == 0)q.addLast(n);
            }
        }
    }

}
