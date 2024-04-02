package org.example.MergeIntervals;


import java.util.ArrayList;
import java.util.Collections;

//Definition for an interval.
class Interval {
    int start;
    int end;
    Interval() { start = 0; end = 0; }
    Interval(int s, int e) { start = s; end = e; }
}

class Solution {
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {

        Collections.sort(intervals, (a, b) -> { return a.start-b.start;});
        int currStart = intervals.get(0).start;
        int currEnd = intervals.get(0).end;
        ArrayList<Interval> ans = new ArrayList<Interval>();

        for(int i=1;i<intervals.size();i++){
            if(currEnd>=intervals.get(i).start){
                currEnd = Math.max(currEnd,intervals.get(i).end);
            }else{
                ans.add(new Interval(currStart,currEnd));
                currStart=intervals.get(i).start;
                currEnd=intervals.get(i).end;
            }
        }
        ans.add(new Interval(currStart,currEnd));
        return ans;
    }
}

public class Main {
    public static void main(String[] args) {
        Interval interval1 = new Interval(1,3);
        Interval interval2 = new Interval(2,6);
        Interval interval3 = new Interval(8,10);
        Interval interval4 = new Interval(15,18);
        ArrayList<Interval> intervals = new ArrayList<Interval>();
        intervals.add(interval1);
        intervals.add(interval2);
        intervals.add(interval3);
        intervals.add(interval4);
        Solution s = new Solution();
        ArrayList<Interval> mergedIntervals = s.merge(intervals);
        intervals.forEach(interval->System.out.println("["+interval.start +" , "+ interval.end + "]"));
        mergedIntervals.forEach(interval->System.out.println("["+interval.start +" , "+ interval.end + "]"));

    }
}
