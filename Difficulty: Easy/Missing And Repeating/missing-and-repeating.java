import java.util.ArrayList;

class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        long n = arr.length;

        // Sum of first n natural numbers and sum of squares
        long sumN = (n * (n + 1)) / 2;
        long sumSqN = (n * (n + 1) * (2 * n + 1)) / 6;

        long sumArr = 0;
        long sumSqArr = 0;

        for (int x : arr) {
            sumArr += x;
            sumSqArr += (long) x * x;
        }

        
        long val1 = sumArr - sumN;

    
        long val2 = sumSqArr - sumSqN;


        val2 = val2 / val1;

        
        long repeating = (val1 + val2) / 2;
        
        // Y = X - val1
        long missing = repeating - val1;

        ArrayList<Integer> result = new ArrayList<>();
        result.add((int) repeating);
        result.add((int) missing);

        return result;
    }
}