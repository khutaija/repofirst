/**
     * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
     * If the last word does not exist, return 0.
     * Note: A word is defined as a character sequence consists of non-space characters only.
     */


class LastWord{
  
    public int lengthOfLastWord(String str)
//input "I am student      ", output 0, should be 7.                    -2
    {
      if(str.equals(""))
      {
        System.out.println("Error: You passed an empty string");
          return 0; 
      
      }
       else
       { 
       int length = 0;
         String lastword = str.substring(str.lastIndexOf(" ")+1);
         length = lastword.length();
         return length;
      
       }
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
