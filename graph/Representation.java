package com.dsa.randomquesgenerator.graph;

import java.util.ArrayList;

public class Representation {

    public static void main(String[] args){

        getGraph();
    }

    public static ArrayList<ArrayList<Integer>> getGraph(){

        int[][] edges = {{0,1}, {0,3}, {1,0}, {1,2},{2,1},{2,3},{3,0},{3,2},{4,5},{4,6},{5,4},{5,6},{6,4},{6,5},{7,8},{8,7}};
        int v = 10;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<v;i++){
            adj.add(new ArrayList<Integer>());
        }

        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
        }

        for(int i=0;i<adj.size();i++){

            System.out.print(i+" ===> ");
            ArrayList<Integer> list = adj.get(i);
            for(int j: list){
                System.out.print(j+" ");
            }

            System.out.println();
        }

        return adj;
    }

    }
