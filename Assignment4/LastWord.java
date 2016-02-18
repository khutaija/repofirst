/**
     * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
     * If the last word does not exist, return 0.
     * Note: A word is defined as a character sequence consists of non-space characters only.
     */


class LastWord{
  
    public int lengthOfLastWord(String str)
//input "I am student      ", output 0, should be 7.                    -2 (I corrected my code)
    int length = 0;
    {
      if(str.equals(""))
      {
        System.out.println("Error: You passed an empty string");
          return 0; 
       }
       else
       { 
        for(int i=str.length()-1; i>=0; i--)
        {
            if(str.charAt(i)!=' ')
            length++;
            if(str.charAt(i)==' ' && length!=0)
            return length ;
        }
      }
      return -1;
    }
  
 
    public static void main(String[] args)
    {
      LastWord call = new LastWord();
      String str1 = "Your best teacher is your last mistake";
      int length = 0;
      length = call.lengthOfLastWord(str1);
      System.out.println("The length of last word is : " + length);
    }
  }
