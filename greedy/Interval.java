package com.dsa.randomquesgenerator.greedy;

import java.util.Comparator;

public class Interval {

    int start;
    int end;
    Interval(int start, int end){
        this.start = start;
        this.end = end;
    }
}

class IncreasingOnStart implements Comparator<Interval> {

    @Override
    public int compare(Interval t1, Interval t2) {
        return t1.start - t2.start;
    }
}

class DecreasingOnStart implements Comparator<Interval> {

    @Override
    public int compare(Interval t1, Interval t2) {
        return t2.start - t1.start;
    }
}

class IncreasingOnEnd implements Comparator<Interval> {

    @Override
    public int compare(Interval t1, Interval t2) {
        return t1.end - t2.end;
    }
}

class DecreasignOnEnd implements Comparator<Interval> {

    @Override
    public int compare(Interval t1, Interval t2) {
        return t2.end - t1.end;
    }
}
