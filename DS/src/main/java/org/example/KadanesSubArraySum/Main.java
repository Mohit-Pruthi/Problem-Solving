package org.example.KadanesSubArraySum;

import java.util.*;
public class Main {
//    public int maxSubArray(int[] nums) {
//        int maxSum = Integer.MIN_VALUE, currSum = 0;
//        for (int i = 0; i < nums.length; i++){
//            currSum += nums[i];
//            maxSum = Math.max(maxSum,currSum);
//            if(currSum<0)
//                currSum=0;
//        }
//        return maxSum;
//    }
    public static long maxSubarraySum(int[] arr, int n) {
        long maxi = Long.MIN_VALUE; // maximum sum
        long sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum > maxi) {
                maxi = sum;
            }
            if (sum < 0)
                sum = 0;
        }
        // To consider the sum of the empty subarray
        // uncomment the following check:
        //if (maxi < 0) maxi = 0;

        return maxi;
    }

    public static void main(String args[]) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = arr.length;
        long maxSum = maxSubarraySum(arr, n);
        System.out.println("The maximum subarray sum is: " + maxSum);

    }

}

