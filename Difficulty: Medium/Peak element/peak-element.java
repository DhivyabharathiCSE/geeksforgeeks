class Solution {
    public int peakElement(int[] arr) {
        int n = arr.length;
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if mid is greater than its neighbors
            boolean leftValid = (mid == 0 || arr[mid] > arr[mid - 1]);
            boolean rightValid = (mid == n - 1 || arr[mid] > arr[mid + 1]);

            if (leftValid && rightValid) {
                return mid; // Peak found
            }

            // Move towards the side with the larger adjacent element
            if (mid > 0 && arr[mid - 1] > arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }
}