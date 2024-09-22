import java.util.* ;
import java.io.*; 

public class Solution {
     public static int[] getFloorAndCeil(int[] a, int n, int x) {
        int floor = -1;
        int ceil = -1; 
        for (int i = 0; i < n; i++) {
            if (a[i] <= x) {
                floor = a[i]; 
            }
            if (a[i] >= x) {
                ceil = a[i];
                break;
            }
        }
        
        return new int[]{floor, ceil};
    }
    
}
