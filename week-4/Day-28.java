import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for(int i = 0; i < N; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i< N-1; i++){
            min = Math.min(min, a[i+1] - a[i]);
        }
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i < N-1; i++){
            if(a[i+1] - a[i] == min){
                sb.append(a[i] + " " + a[i+1] + " ");
            }
        }
        System.out.println(sb.toString());
     }
}
