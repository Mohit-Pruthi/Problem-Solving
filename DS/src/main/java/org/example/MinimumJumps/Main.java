package org.example.MinimumJumps;
class Solution {
    public int solve(int[] A) {
        int n= A.length;
        int curr=0,far=0,jumps=0;

        for(int i=0;i<n;i++){
            if(far<i)
                return -1;
            far = Math.max(far,A[i]+i);
            if(curr==i && i!=n-1){
                curr=far;
                jumps++;
            }
        }
        return jumps;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s =new Solution();
        int[] A = {3,2,1,0,1};
        s.solve(A);
        System.out.println("Hello world!");

    }
}