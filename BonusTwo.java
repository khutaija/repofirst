class BonusTwo
{
	public boolean isUgly(int n)
	{ boolean x;
		if (n==0) 
			return false;
		
	 	while (n%2==0)	
			n = n/2;
		while (n%3==0)
			n = n/3;
		while (n%5 == 0)
			n = n/5;
	 if(n==1) 
	 	return true;
        else 
       return false;
	}

	public static void main(String[] args)
	{
		BonusTwo obj = new BonusTwo();
		boolean sol = obj.isUgly(900);
		if(sol == true)
   		System.out.println("It is an Ugly number");
   	    else
   		System.out.println("It is not an ugly number");

	}
}
