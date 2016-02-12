class Robot
{
	public int checkMessage(String message)//input SSS, return 0, should be 1.                   -3
	
	{   
		int count=0;
		int count1=0;
		
		for(int i = 0; i<message.length(); i++)
		{
			if ((message.charAt(i)=='S') || (message.charAt(i)=='O'))
				count1++;
		}
		 count = message.length()-(count1);
		 return count;
	}
		public static void main(String[] args)
		{
		  Robot mars = new Robot();
		  String msg = "SOSKSOSPSOSKSOSL";
		  int result = mars.checkMessage(msg);
		  System.out.println("The number of characters changed by radiation " + result);
	     }
}
