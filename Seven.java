class Seven
{
	public int[] fibonacciNumber(int n)
	{	int[] fib = new int[n];
		int fib1 = 1;
		int fib2 = 1;
		if (n==0)
			System.out.println("Invalid value for n");
			else if(n==1){
				fib[0] = 1;
				
			}
			else
			{
				for(int i=2;i<n;i++)
				{   fib[0] = 1;//you should put "fib[0]=1;fib[1]=1;" outside the for loop
					fib[1] = 1;
					fib[i] = fib[i-1] + fib[i-2];
				}
			}
		
		return fib;


	}
	public static void main(String[] args)
	{
		Seven series = new Seven();
		int[] fibb = series.fibonacciNumber(12);
		for(int j=0; j<fibb.length; j++)
		System.out.println("The fibonacci series is: " + fibb[j] );


	}
}
