/**
 * Find N fibonacci numbers Fibonacci Number: f(N) = f(N-1)+f(N-2). Typically,
 * f(0)=f(1)=1.
 */
public class Fibonacci {

	public int[] fibonacciNumber(int n) {
		int[] fib = new int[n];
		int fib1 = 1;
		int fib2 = 1;
		if (n == 0)
			System.out.println("Invalid value for n");
		else if (n == 1) {
			fib[0] = 1;

		} else {
				fib[0] = 1;
				fib[1] = 1;
			for (int i = 2; i < n; i++) 
			{
				fib[i] = fib[i - 1] + fib[i - 2];
			}
		}

		return fib;

	}

	public static void main(String[] args) {
		Fibonacci series = new Fibonacci();
		int[] fibb = series.fibonacciNumber(12);
		System.out.println("The fibonacci series is: ");
		for (int j = 0; j < fibb.length; j++)
			System.out.println(fibb[j]);

	}

}
