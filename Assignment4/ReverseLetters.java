/*
 	 * Reverse a string by letters. 
 */
  
  class ReverseLetters
  {	
    
  	public String reverseString1(String str){
    
    if(str == null)
    return null;
    
    String s2 = "";

		for (int i = (str.length()-1); i>=0 ;i--)
    {
      s2 = s2 + str.charAt(i);
    }
    return s2;
    }

  	 public static void main(String[] args)
  	 {
        ReverseLetters obj = new ReverseLetters();
        String s1 = "Aibohphobia is a fear of palindromes";
        String s3;
        s3 = obj.reverseString1(s1);
        System.out.println(s3);
  	 }
  	}