class Three
{//Good job! It's interesting to think about it: What if n<2? Like n = 1, n = 0, or even n = -100.
	 public boolean isPrimeNumber(int n)
	 {
         for(int i=2; i<n; i++)
         {
         if(n%i==0)
       	 return false;
       	}
       	return true;
       }
	 
	public static void main(String[] args)
	{    Three prime = new Three();
		boolean x = prime.isPrimeNumber(14);
		if(x==true)
		System.out.println("The number is prime");
	else
		System.out.println("The number is not prime");

	}

}
