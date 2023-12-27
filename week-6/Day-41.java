import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Solution
{
    public static void main(String[] args)
    {
        final Scanner in = new Scanner(System.in);
        final int numberOfTests = in.nextInt();

        final List<Boolean> containWatsonSum = new ArrayList<>(numberOfTests);

        for (int i = 0; i < numberOfTests; i++)
        {
            final int numberOfArrayElements = in.nextInt();

            containWatsonSum.add(
                    containsWatsonSum(
                            IntStream
                                    .generate(in::nextInt)
                                    .limit(numberOfArrayElements)
                                    .toArray()));
        }

        containWatsonSum
                .stream()
                .map(contains -> contains ? "YES" : "NO")
                .forEach(System.out::println);
    }

    private static boolean containsWatsonSum(int[] array)
    {
        int leftSum = 0;
        int rightSum = IntStream.of(array).skip(1).sum();

        for (int i = 0; i < array.length - 1; i++)
        {
            if (leftSum == rightSum)
            {
                return true;
            }
            else
            {
                leftSum += array[i];
                rightSum -= array[i + 1];
            }
        }

        return leftSum == 0;

    }
}
