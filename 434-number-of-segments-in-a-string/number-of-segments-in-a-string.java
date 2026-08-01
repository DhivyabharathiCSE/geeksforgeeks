class Solution {
    public int countSegments(String s) {
        s = s.trim();
        if(s.equals("")) 
        return 0;
        String[] st = s.split("\\s+");
        return st.length;
    }
}