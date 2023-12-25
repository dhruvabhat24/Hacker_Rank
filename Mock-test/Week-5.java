import java.math.BigInteger;
import java.util.Scanner;


public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		BigInteger a = BigInteger.valueOf(in.nextInt());
		BigInteger b = BigInteger.valueOf(in.nextInt());
		int n = in.nextInt();
		for(int i = 2; i < n; i++) {
			BigInteger next = b.multiply(b).add(a);
			a = b;
			b = next;
		}
		System.out.println(b);
	}
}
