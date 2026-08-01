class Solution {
    public static int findEquilibrium(int arr[]) {
        int totalSum = 0;
        
        for (int num : arr) {
            totalSum += num;
        }
        
        int leftSum = 0;
        
        for (int i = 0; i < arr.length; i++) {
            // rightSum is totalSum - leftSum - arr[i]
            int rightSum = totalSum - leftSum - arr[i];
            
            if (leftSum == rightSum) {
                return i; // 0-based index
            }
            
            leftSum += arr[i];
        }
        
        return -1; // Return -1 if no equilibrium point exists
    }
}