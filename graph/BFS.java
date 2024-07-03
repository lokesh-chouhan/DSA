package com.dsa.randomquesgenerator.graph;

import java.util.ArrayList;
import java.util.LinkedList;

public class BFS {

    public static void main(String[] args){

        ArrayList<ArrayList<Integer>> adj = Representation.getGraph();
        bfsDemo(adj);
    }

    public static void bfsDemo(ArrayList<ArrayList<Integer>> adj){

        int visit[] = new int[adj.size()];
        bfs(adj, visit, 0);

    }

    public static void bfs(ArrayList<ArrayList<Integer>> adj, int[] visit, int v){

        LinkedList<Integer> q = new LinkedList<>();
        visit[v] = 1;
        q.addLast(v);
        while(!q.isEmpty()){
            int t = q.removeFirst();
            for(int i:adj.get(t)){
                if(visit[i]==0){
                    visit[i] = 1;
                    q.addLast(i);
                }
            }
            System.out.println(t);
        }
    }
}
