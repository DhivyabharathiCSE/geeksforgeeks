class Solution {
    int maxSubarraySum(int[] arr) {
        int maxSoFar = arr[0];
        int currentMax = arr[0];

        for (int i = 1; i < arr.length; i++) {
            // Either add current element to existing sum, or start new subarray from current element
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            // Track the maximum sum found so far
            maxSoFar = Math.max(maxSoFar, currentMax);
        }

        return maxSoFar;
    }
}