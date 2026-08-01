class Solution {
    public static boolean isPalinArray(int[] arr) {
        for (int num : arr) {
            if (!isPalindrome(num)) {
                return false; // If any number is not a palindrome, return false
            }
        }
        return true;
    }

    private static boolean isPalindrome(int n) {
        int original = n;
        int reversed = 0;

        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }

        return original == reversed;
    }
}