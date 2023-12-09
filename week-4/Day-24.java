import java.io.*;
import java.util.*;

public class Solution
{
	public static void main(String[] args)
	{
		Scanner readIn = new Scanner(System.in);
		
		int n = readIn.nextInt();
		int[] frequencie = new int[100];
		for(int ii = 0; ii < n; ii++)
			frequencie[readIn.nextInt()]++;
		
		int out = Integer.MIN_VALUE;
		for(int ii = 0; ii < frequencie.length - 1; ii++)
			out = frequencie[ii] + frequencie[ii + 1] > out ? frequencie[ii] + frequencie[ii + 1] : out;
		
		System.out.println(out);
	}
}
