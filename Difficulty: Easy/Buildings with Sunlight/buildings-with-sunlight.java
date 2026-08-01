class Solution {
    public int visibleBuildings(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        int count = 1; // The first building always receives sunlight
        int maxHeight = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= maxHeight) {
                count++;
                maxHeight = arr[i]; // Update the maximum height seen so far
            }
        }

        return count;
    }
}