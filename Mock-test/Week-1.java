import java.io.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
class Result {
 public static int findMedian(List<Integer> arr) {
 // Write your code here
 // Sort the list
 arr.sort(null);
 // Find the middle index
 int midIndex = arr.size() / 2;
 // Return the median value
 return arr.get(midIndex);
 }
}
public class Solution {
 public static void main(String[] args) throws IOException {
 BufferedReader bufferedReader = new BufferedReader(new
InputStreamReader(System.in));
 BufferedWriter bufferedWriter = new BufferedWriter(new
OutputStreamWriter(System.out));
 int n = Integer.parseInt(bufferedReader.readLine().trim());
 List<Integer> arr =
Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
 .map(Integer::parseInt)
 .collect(Collectors.toList());
 int result = Result.findMedian(arr);
 bufferedWriter.write(String.valueOf(result));
 bufferedWriter.newLine();
 bufferedReader.close();
 bufferedWriter.close();
 }
}
