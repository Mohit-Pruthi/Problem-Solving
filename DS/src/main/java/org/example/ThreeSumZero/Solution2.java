package org.example.ThreeSumZero;

import java.sql.Array;
import java.util.*;

public class Solution2 {
    public static void main(String[] args) {
//        Input: nums = [-1,0,1,2,-1,-4]
//        Output: [[-1,-1,2],[-1,0,1]]
        int[] A = {-1,0,1,2,-1,-4};
        Arrays.sort(A);
        int n = A.length;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for(int i=0;i<n-2;i++){
            if(i>0 && A[i]==A[i-1]) continue;
            int l =i+1;
            int r = n-1;
            while(l<r){
                ArrayList<Integer> temp = new ArrayList<>();

                int sum = A[i]+A[l]+A[r];
                if(sum==0) {
                    temp.add(A[i]);
                    temp.add(A[l]);
                    temp.add(A[r]);
                    ans.add(temp);
                    l++;r--;
                    while(l<r && A[l]==A[l-1]) l++;
                }
                if(sum<0)
                    l++;
                if(sum>0)
                    r--;
            }
        }
        ans.forEach(System.out::println);

    }
}
