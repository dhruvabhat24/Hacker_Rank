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

    public static String gamingArray(List<Integer> arr) {
        if(arr.size()==1)
            return "BOB";
        if(arr.size()==2)
        {
            if(arr.get(0)<arr.get(1))
                return "ANDY";
            else
                return "BOB";
        }
            
        int max = Collections.max(arr);
        int cur = arr.get(0);
        int count = 0;
        for(int i=1; cur!=max; i++ ){
            if(cur<arr.get(i))
            {
                cur = arr.get(i);
                count++;
            }
        }
        if(count%2!=0)
            return "ANDY";
        return "BOB";
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int g = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, g).forEach(gItr -> {
            try {
                int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

                List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

                String result = Result.gamingArray(arr);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
