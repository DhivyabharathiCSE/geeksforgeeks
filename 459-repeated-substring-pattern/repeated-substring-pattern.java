class Solution {
    public boolean repeatedSubstringPattern(String s) {
         String doubled = s + s;
          String modified = doubled.substring(1, doubled.length() - 1);
          if (modified.contains(s)) 
            return true;   
        else 
            return false;  
        }
}
    