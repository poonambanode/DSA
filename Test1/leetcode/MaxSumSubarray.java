package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaxSumSubarray {

    public static int findMaxSumArray(int[] arr, int k) {
        int runningSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length; i++) {
            runningSum += arr[i];
            if(i >= k - 1){
                maxSum = Math.max(maxSum,runningSum);
                runningSum -= arr[i - (k - 1)];
            }
        }
        return maxSum;
    }

    public static int smallestSubArray(int[] arr, int targetSum) {

        int runningSum = 0;
        int minWindowSize = Integer.MAX_VALUE; // min sub array which is >= 8
        int windowStart = 0;

        for(int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            runningSum += arr[windowEnd];
            while(runningSum >= targetSum) {
                minWindowSize = Math.min(minWindowSize, windowEnd - windowStart + 1);
                runningSum -= arr[windowStart];
                windowStart++;
            }
        }
        return minWindowSize;
    }


    public static int longestSubString(char[] arr, int k) {

        Map<Character, Integer> map = new HashMap<>();
        int maxSubStringLength = Integer.MIN_VALUE;
        int leftIndex = 0;

        for(int i = 0 ; i < arr.length ; i++) {
            map.put(arr[i], map.getOrDefault(arr[i],0) + 1);
            while(map.size() > k) {
                map.put(arr[leftIndex], map.get(arr[leftIndex]) - 1);
                if(map.get(arr[leftIndex]) == 0) {
                    map.remove(arr[leftIndex]);
                }
                leftIndex++;
            }
            if(map.size() == k)
                maxSubStringLength = Math.max(maxSubStringLength, map.values().stream().mapToInt(Integer::intValue).sum());
        }
        return maxSubStringLength;
    }

    public static int findLengthOfLCIS(int[] nums) {

        int maxLength = Integer.MIN_VALUE;
        int windowStart = 0;

        for(int i=0 ; i <nums.length;i++) {
            if(i > 0 && nums[i -1] >= nums[i]){
                windowStart = i;
            }
            maxLength = Math.max(maxLength, i - windowStart +1);
        }

        return maxLength;
    }

    public static void  main(String[] args) {
        // Maximum sum of Subarray of size k
        System.out.println(findMaxSumArray(new int[]{4,2,1,7,8,1,2,8,1,0}, 3));
        // Smallest subarray sum >= 8
        System.out.println(smallestSubArray(new int[]{4,2,1,7,8,1,2,8,1,0}, 8));
        //Longest Substring length with k district character
        System.out.println(longestSubString(new char[]{'A','A','A','H','H','I','I','B','C'}, 3));
        System.out.println(findLengthOfLCIS(new int[]{1,3,5,4,7}));

        System.out.println(5/2);
    }
}
