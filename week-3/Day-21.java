import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] sticks = new int[n];
        for(int i=0; i < n; i++){
            sticks[i] = in.nextInt();
        }
        Arrays.sort(sticks);
        int trianglePosition = n-3;
        while ((trianglePosition>=0) && (sticks[trianglePosition] + sticks[trianglePosition+1] <= sticks[trianglePosition+2])) {
             trianglePosition--;
        }
        if (trianglePosition < 0) {
            System.out.println(-1);
        } else {
            System.out.println(sticks[trianglePosition] + " " + sticks[trianglePosition + 1] + " " + sticks[trianglePosition + 2]);
             }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
