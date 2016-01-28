class BonusOne
{
	public int addDigits(int n)
    {
      int sum = 0;
	  while(n>9)
	  {
	   sum = 0;
       while (n>0)
		{ 
		 int rem;
		 rem = n%10;
	     sum = sum + rem;
	     n = n/10;
		}
	  n = sum;
	  }
     return sum;
    }
	

  public static void main(String[] args)
	{
      BonusOne add = new BonusOne();
      int number = add.addDigits(872);
      System.out.println("The single digit number is: " + number);

	}
}