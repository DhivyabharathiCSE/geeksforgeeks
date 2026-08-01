class Solution {
    public long kthElement(int[] a, int[] b, int k) {
        int i = 0, j = 0;
        int count = 0;
        long ans = 0;

        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                ans = a[i];
                i++;
            } else {
                ans = b[j];
                j++;
            }

            count++;

            if (count == k) {
                return ans;
            }
        }

        // Remaining elements of array a
        while (i < a.length) {
            ans = a[i++];
            count++;

            if (count == k) {
                return ans;
            }
        }

        // Remaining elements of array b
        while (j < b.length) {
            ans = b[j++];
            count++;

            if (count == k) {
                return ans;
            }
        }

        return -1;
    }
}