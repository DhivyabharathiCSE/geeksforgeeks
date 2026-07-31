class Solution {
    public int titleToNumber(String columnTitle) {
        int result=0;
        int n=columnTitle.length();
        for(int i=n-1;i>=0;i--)
            result+=((columnTitle.charAt(i)-64)*Math.pow(26,n-i-1));
        return result;
    }
}