/**
	 * Given a integer 'n', return n%count, count is the number of digits of n
	 * For example, n = 100, return 1
	 */
	 class Count
{
	public int countDigits(int n)
	{	
		
		int count = 0;
		int res=0, temp=0;
		temp = n;
 		while(n!=0)
 		{   
 			n = n/10;
 			count++;
 		}
 		res = (temp%count);
 		
 		return res;
	}
	public static void main(String[] args)
	{  

		Count c = new Count();
		int result = c.countDigits(500);
		System.out.println("The result is: " + result);

	}
}