package com.dsa.randomquesgenerator;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PQDemo {

    public static void main(String args[]){

        int ar[][] = {{2,9},{1,7},{3,4}};

        PriorityQueue<Pair1> pq1 = new PriorityQueue<>(new IncreaseOnA1());
        PriorityQueue<Pair1> pq2 = new PriorityQueue<>(new DecreaseOnA1());
        PriorityQueue<Pair1> pq3 = new PriorityQueue<>(new IncreaseOnB1());
        PriorityQueue<Pair1> pq4 = new PriorityQueue<>(new DecreaseOnB1());
        for(int i=0;i<ar.length;i++){
            pq1.add(new Pair1(ar[i][0], ar[i][1]));
            pq2.add(new Pair1(ar[i][0], ar[i][1]));
            pq3.add(new Pair1(ar[i][0], ar[i][1]));
            pq4.add(new Pair1(ar[i][0], ar[i][1]));
            System.out.println(ar[i][0]+"  "+ar[i][1]);
        }

        System.out.println("============================");

        while(!pq1.isEmpty()){
            Pair1 p = pq1.remove();
            System.out.println(p.a+"  "+p.b);
        }

        System.out.println("============================");

        while(!pq2.isEmpty()){
            Pair1 p = pq2.remove();
            System.out.println(p.a+"  "+p.b);
        }

        System.out.println("============================");

        while(!pq3.isEmpty()){
            Pair1 p = pq3.remove();
            System.out.println(p.a+"  "+p.b);
        }

        System.out.println("============================");

        while(!pq4.isEmpty()){
            Pair1 p = pq4.remove();
            System.out.println(p.a+"  "+p.b);
        }



    }
}

class Pair1{

    int a;
    int b;
    Pair1(int a, int b){

        this.a = a;
        this.b = b;
    }
}

class IncreaseOnA1 implements Comparator<Pair1>{
    @Override
    public int compare(Pair1 p1, Pair1 p2) {
        return p1.a - p2.a;
    }
}

class DecreaseOnA1 implements Comparator<Pair1>{
    @Override
    public int compare(Pair1 p1, Pair1 p2) {
        return p2.a - p1.a;
    }
}

class IncreaseOnB1 implements Comparator<Pair1>{
    @Override
    public int compare(Pair1 p1, Pair1 p2) {
        return p1.b - p2.b;
    }
}

class DecreaseOnB1 implements Comparator<Pair1>{
    @Override
    public int compare(Pair1 p1, Pair1 p2) {
        return p2.b - p1.b;
    }
}
