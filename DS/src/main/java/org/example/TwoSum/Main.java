package org.example.TwoSum;

import java.util.HashMap;

public class Main {
    public static int[] twoSum(int n, int []arr, int target){
        int[] ans = {-1,-1};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            int first = arr[i];
            int second = target - first;
            if(map.containsKey(second)){
                ans[0] = map.get(second);;
                ans[1] = i;
            }
            map.put(arr[i],i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] arr = {2, 6, 5, 8, 11};
        int target = 13;
        int[] ans1 = twoSum(n, arr, target);
        System.out.println("The answer for variant 2 using MAP: [" + ans1[0] + ", "
                + ans1[1] + "]");
        int[] ans2 = twoSum2(n, arr, target);
        System.out.println("The answer for variant 2 using Two Pointers: [" + ans2[0] + ", "
                + ans2[1] + "]");
    }

    private static int[] twoSum2(int n, int[] arr, int target) {
        int[] ans = {-1,-1};
        int l=0,r=n-1;
        while(l<r){
            if(arr[l] + arr[r] == target) {
                ans[0]=l;
                ans[1]=r;
                return ans;
            }
            else if(arr[l] + arr[r] < target)
                l++;
            else
                r--;
        }
        return ans;
    }
}
