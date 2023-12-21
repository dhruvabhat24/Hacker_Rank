import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] A = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = in.nextInt();
        }

        int m = in.nextInt();
        int[] B = new int[m];

        for (int i = 0; i < m; i++) {
            B[i] = in.nextInt();
        }

        HashMap<Integer, Integer> freqs = new HashMap<Integer, Integer>();

        for (int i = 0; i < m; i++) {
            if (freqs.containsKey(B[i])) {
                int freq = freqs.get(B[i]);
                freqs.replace(B[i], freq + 1);
            } else {
                freqs.put(B[i], 1);
            }
        }

        for (int i = 0; i < n; i++) {
            if (freqs.containsKey(A[i])) {
                int freq = freqs.get(A[i]);
                if (freq == 1) {
                    freqs.remove(A[i]);
                } else {
                    freqs.replace(A[i], freq - 1);
                }
            } else {
                System.out.println("error");
            }
        }

        StringBuilder answer = new StringBuilder();
        Iterator it = freqs.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            answer.append(pair.getKey());
            answer.append(" ");
        }

        System.out.println(answer.toString());
    }
}
