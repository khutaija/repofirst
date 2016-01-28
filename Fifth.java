class Fifth
{
	public int countLetter(String str, char c)
	{
		int count = 0;
		for(int i=0;i<str.length();i++)
        {
        	if(str.charAt(i) == c)
        		count++;
        }
        return count;
	}
		public static void main(String[] args)
		{   String strng = "The Missisippi river is blue in colour";
		    char ch = 'i';
			Fifth occur = new Fifth();
			int occurance = occur.countLetter(strng, ch);
			System.out.println("Number of occurances of given letter are " + occurance);
		}
}