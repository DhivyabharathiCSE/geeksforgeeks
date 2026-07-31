class Solution {
    public String smallestPalindrome(String s) {
            int n = s.length();

        if (n == 1) return s;

        char[] half = s.substring(0, n / 2).toCharArray();
        Arrays.sort(half);

        String leftHalf = new String(half);
        StringBuilder sb = new StringBuilder(leftHalf);

        String mid = (n % 2 == 1)
                ? String.valueOf(s.charAt(n / 2))
                : "";

        return leftHalf + mid + sb.reverse().toString();
    }
}