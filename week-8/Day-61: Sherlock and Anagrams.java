import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'sherlockAndAnagrams' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static boolean isAnagram(String s1, String s2){
    char [] str1 = s1.toCharArray();
    char [] str2 = s2.toCharArray();
    Arrays.sort(str1);
    Arrays.sort(str2);
    return Arrays.equals(str1, str2);
}

    public static int sherlockAndAnagrams(String s) {
int numAnagrams = 0;
for(int i=1; i<s.length(); i++){
    List<String> iSizedStrings = getSubString(s, i);
    List<List<String>> sol = getSubsets(iSizedStrings, 2);
    for(int j=0;j<sol.size();j++){
           String l1 = sol.get(j).get(0);
           String l2 = sol.get(j).get(1);
           if(isAnagram(l1,l2)){
                numAnagrams++;
                }
       }
}
return numAnagrams;
}


public static List<String> getSubString(String str,int k){
    List<String> subStrings = new ArrayList<String>();
    for(int i=0; i<=str.length()-k; i++){
        subStrings.add(str.substring(i, i+k));
    }
    return subStrings;
}
private static <T> void getSubsets(List<T> superSet, int k, int idx, 
        List<T> current, List<List<T>> solution) {

    if (current.size() == k) {
        solution.add(new ArrayList<>(current));
        return;
    }

    for (int i = idx; i < superSet.size(); i++) {
        T x = superSet.get(i);
        current.add(x);
        getSubsets(superSet, k, i + 1, current, solution);
        current.remove(current.size() - 1);
    }
}

public static <T> List<List<T>> getSubsets(List<T> superSet, int k) {
    List<List<T>> res = new ArrayList<>();
    getSubsets(superSet, k, 0, new ArrayList<T>(), res);
    return res;
}

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                int result = Result.sherlockAndAnagrams(s);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
