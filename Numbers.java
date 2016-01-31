class Numbers
{
	public void printNumbers(int n)
	{
		if(n%2==0)
		{
			for(int i=0; i<(n*2); i++)
			{
				if(i%2==0)
					System.out.println(i);
			}
		}
			else if(n%2 == 1)
			{
				for( int j=1; j<(n*2); j++)
				{
					if(j%2==1)
						System.out.println(j);
				}
			}

	}
	public static void main(String[] args)
	{
		Numbers n = new Numbers();
		n.printNumbers(11);
	}
}