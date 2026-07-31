import java.util.Arrays;

class Solution {
    public int minPlatform(int arr[], int dep[]) {
        int n = arr.length;
        
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        int platformsNeeded = 0;
        int maxPlatforms = 0;
        
        int i = 0; 
        int j = 0; 
        
       
        while (i < n && j < n) {
            if (arr[i] <= dep[j]) {
                platformsNeeded++;
                i++;
            } else { // Next event is a departure
                platformsNeeded--;
                j++;
            }
            
            maxPlatforms = Math.max(maxPlatforms, platformsNeeded);
        }
        
        return maxPlatforms;
    }
}