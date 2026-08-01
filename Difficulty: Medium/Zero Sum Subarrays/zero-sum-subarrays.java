import java.util.HashMap;

class Solution {
    public static long findSubarray(int[] arr) {
        HashMap<Long, Long> map = new HashMap<>();
        
        long count = 0;
        long prefixSum = 0;

        map.put(0L, 1L);

        for (int num : arr) {
            prefixSum += num;

            if (map.containsKey(prefixSum)) {
                count += map.get(prefixSum);
            }

            map.put(prefixSum, map.getOrDefault(prefixSum, 0L) + 1);
        }

        return count;
    }
}