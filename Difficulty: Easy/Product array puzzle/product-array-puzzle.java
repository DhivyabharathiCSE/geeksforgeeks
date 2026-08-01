class Solution {
    public static int[] productExceptSelf(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];

        // Initially store the product of all elements to the left
        int leftProduct = 1;

        for (int i = 0; i < n; i++) {
            res[i] = leftProduct;
            leftProduct *= arr[i];
        }

        // Multiply with the product of all elements to the right
        int rightProduct = 1;

        for (int i = n - 1; i >= 0; i--) {
            res[i] *= rightProduct;
            rightProduct *= arr[i];
        }

        return res;
    }
}