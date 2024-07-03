package com.dsa.randomquesgenerator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ObjectComparator {

    public static void main(String[] args) {

        ArrayList<Pair> list = new ArrayList<>();

        int ar[][] = {{2,9}, {1,7}, {3,4}};

        for(int i=0;i< ar.length;i++){

            list.add(new Pair(ar[i][0], ar[i][1]));
        }

        for(Pair p:list){
            System.out.println(p.a+"   "+p.b);
        }

        System.out.println("==========================");
        Collections.sort(list, new IncreaseOnA());

        for(Pair p:list){
            System.out.println(p.a+"   "+p.b);
        }

        System.out.println("==========================");
        Collections.sort(list, new DecreaseOnA());

        for(Pair p:list){
            System.out.println(p.a+"   "+p.b);
        }

        System.out.println("==========================");
        Collections.sort(list, new IncreaseOnB());

        for(Pair p:list){
            System.out.println(p.a+"   "+p.b);
        }

        System.out.println("==========================");
        Collections.sort(list, new DecreaseOnB());

        for(Pair p:list){
            System.out.println(p.a+"   "+p.b);
        }

    }

}

class Pair{

    int a;
    int b;
    Pair(int a, int b){
        this.a = a;
        this.b= b;
    }
}

class IncreaseOnA implements Comparator<Pair>{

    @Override
    public int compare(Pair p1, Pair p2) {
        return p1.a - p2.a;
        //return 0;
    }
}

class DecreaseOnA implements Comparator<Pair>{

    @Override
    public int compare(Pair p1, Pair p2) {
        return p2.a - p1.a;
    }
}

class IncreaseOnB implements Comparator<Pair>{


    @Override
    public int compare(Pair p1, Pair p2) {
        return p1.b - p2.b;
    }
}

class DecreaseOnB implements Comparator<Pair>{

    @Override
    public int compare(Pair p1, Pair p2) {
        return p2.b - p1.b;
    }
}
