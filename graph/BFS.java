package com.dsa.randomquesgenerator.graph;

import java.util.ArrayList;
import java.util.LinkedList;

public class BFS {

    public static void main(String[] args){

        ArrayList<ArrayList<Integer>> adj = Representation.getGraph();
        bfs(adj);
    }

    public static void bfs(ArrayList<ArrayList<Integer>> adj){

        int[] visit = new int[adj.size()];
        LinkedList<Integer> q = new LinkedList<>();
        visit[0] = 1;
        q.addLast(0);
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
