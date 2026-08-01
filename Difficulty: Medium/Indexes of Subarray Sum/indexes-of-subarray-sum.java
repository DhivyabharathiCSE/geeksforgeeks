import java.util.ArrayList;

class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> result = new ArrayList<>();
        int s = 0; // Start pointer of the sliding window
        int currentSum = 0;

        for (int e = 0; e < arr.length; e++) {
            currentSum += arr[e];

            while (currentSum > target && s < e) {
                currentSum -= arr[s];
                s++;
            }

            if (currentSum == target) {
                result.add(s + 1); // 1-based index for start
                result.add(e + 1); // 1-based index for end
                return result;
            }
        }

        result.add(-1);
        return result;
    }
}