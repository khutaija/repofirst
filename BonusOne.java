class BonusOne
{//Bug: what if n is less than 10, like n = 6? You should return 6 but your code will actually return 0.
	public int addDigits(int n)
    {
      int sum = 0;
	  while(n>9)
	  {
	   sum = 0;
       while (n>0)
		{ 
		 int rem;//just a recommendation: these three lines could be combined to "sum += n%10"
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
