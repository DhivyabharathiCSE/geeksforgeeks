import java.util.Arrays;

class Solution {
    public int minSwaps(int[] arr) {
        int n = arr.length;

        // Pair each element with its original index
        Pair[] vec = new Pair[n];
        for (int i = 0; i < n; i++) {
            vec[i] = new Pair(arr[i], i);
        }

        Arrays.sort(vec, (a, b) -> Integer.compare(a.val, b.val));

        boolean[] visited = new boolean[n];
        int ans = 0;

        for (int i = 0; i < n; i++) {
            if (visited[i] || vec[i].idx == i) {
                continue;
            }

            int cycleSize = 0;
            int j = i;

            while (!visited[j]) {
                visited[j] = true;
                j = vec[j].idx; // Move to the original index
                cycleSize++;
            }

            if (cycleSize > 0) {
                ans += (cycleSize - 1);
            }
        }

        return ans;
    }

    static class Pair {
        int val;
        int idx;

        Pair(int val, int idx) {
            this.val = val;
            this.idx = idx;
        }
    }
}