package com.dsa.randomquesgenerator.greedy;

import java.util.ArrayList;
import java.util.Collections;

public class MeetingRoom {

    public static void main(String args[]){

        System.out.println("Hello World");

        int ar[][] = {{0,5},{3,4},{1,2},{5,9},{5,7},{58,9}};
        ArrayList<Interval> list = new ArrayList<>();
        for(int i=0;i<ar.length;i++){
            list.add(new Interval(ar[i][0],ar[i][1]));
        }

        System.out.println("Maximum meetings = "+findMaxMeetings(list));

    }

    public static int findMaxMeetings(ArrayList<Interval> intervals){

        Collections.sort(intervals, new IncreasingOnEnd());

        int n = 1;
        int t = intervals.get(0).end;

        for(int i=1;i<intervals.size();i++){
            if(intervals.get(i).start > t){
                n++;
                t = intervals.get(i).end;
            }
        }
        return n;
    }
}
