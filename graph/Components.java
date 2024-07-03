package com.dsa.randomquesgenerator.graph;

import java.util.ArrayList;

public class Components {

    public static void main(String[] args){

        ArrayList<ArrayList<Integer>> adj = Representation.getGraph();
        countComponents(adj);


    }

    public static void countComponents(ArrayList<ArrayList<Integer>> adj){

        int visit[] = new int[adj.size()];
        int c = 0;
        for(int i=0;i<visit.length;i++){
            if(visit[i] == 0){
                c++;
                BFS.bfs(adj, visit, i);
            }
        }
        System.out.println("Number of components = "+c);

    }
}
