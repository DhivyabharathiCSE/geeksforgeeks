class Solution {
    public int maximumProduct(int[] nums) {
        int max = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

        for (int n : nums) {
            // update top 3
            if (n >= max)        { max3 = max2; max2 = max; max = n; }
            else if (n >= max2)  { max3 = max2; max2 = n; }
            else if (n > max3)   { max3 = n; }

            // update bottom 2
            if (n <= min1)       { min2 = min1; min1 = n; }
            else if (n < min2)   { min2 = n; }
        }

        return Math.max(max * max2 * max3,min1*min2*max);
    }
}