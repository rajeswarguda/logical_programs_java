package Logic;
import java.util.stream.LongStream;

public class CalculateFactorial {

	public static void main(String[] args) {

		System.out.println("factorialIterative : " + factorialIterative(5));
		System.out.println("factorialRecursive : " + factorialRecursive(5));
		System.out.println("factorialStreams : " + factorialStreams(5));

	}

	public static long factorialIterative(long n) {
		long r = 1;
		for (long i = 1; i <= n; i++) {
			r *= i;
		}
		return r;
	}

	public static long factorialRecursive(long n) {
		return n == 1 ? 1 : n * factorialRecursive(n - 1);
	}

	public static long factorialStreams(long n) {
		return LongStream.rangeClosed(1, n).reduce(1, (long a, long b) -> a * b);
	}

}
