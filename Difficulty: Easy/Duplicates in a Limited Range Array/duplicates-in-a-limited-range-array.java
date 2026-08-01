import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            // Get the target index for the current number (1-based to 0-based mapping)
            int index = Math.abs(arr[i]) - 1;
            
            // If the value at index is already negative, we found a duplicate
            if (arr[index] < 0) {
                result.add(index + 1);
            } else {
                // Mark the number as visited by negating the element at 'index'
                arr[index] = -arr[index];
            }
        }
        
        return result;
    }
}