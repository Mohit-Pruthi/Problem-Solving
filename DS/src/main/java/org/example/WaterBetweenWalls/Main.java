package org.example.WaterBetweenWalls;


import java.util.ArrayList;

public class Main {

    public static int maxArea(ArrayList<Integer> A) {
        if (A == null)
            return 0;
        int n = A.size();
        int first = 0;
        int last = n - 1;
        int area = 0;
        while (first < last) {
            int width = last - first;
            // finds the area for the current window
            area = Math.max(area, Math.min(A.get(first), A.get(last)) * width);
            if (A.get(first).intValue() >= A.get(last).intValue())
                last--;
            else
                first++;
        }
        return area;
    }

    public static void main(String[] args) {
        int n = 5;
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);arr.add(5);arr.add(4);arr.add(3);
        for(Integer i :arr){
            System.out.println(i);
        }
        int ans1 = maxArea( arr );
        System.out.println("Max Area:" +ans1 );
    }
}
