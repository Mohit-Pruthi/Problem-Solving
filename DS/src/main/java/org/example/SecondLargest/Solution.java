package org.example.SecondLargest;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {9,8,5,3,2,1};//{3,4,5,1};//{1,2,4,4,3}; //{1,2,4,3,3}

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;


        for(int i=0 ;i<arr.length;i++){
            if(arr[i]>max1){
                max2 = max1;
                max1 = arr[i];
            }
            else if(arr[i]>max2 && arr[i]!=max1) { // && arr[i]!=max1
                //if (arr[i] == max1) continue;
                max2 = arr[i];
            }
        }
        System.out.println("SECOND MAXIMUM="+ max2);
    }
}
