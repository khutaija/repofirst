public class Second
{
	public int[] checkGrade(int[] scores)
	 {
       int[] x = new int[scores.length];
       for(int i=0;i<scores.length;i++)
		{
	     if (scores[i]>=90)
		 x[i]=4;

	    if ((scores[i]>=80) && (scores[i]<90))
		 x[i]=3;
	
	    if ((scores[i]<80) && (scores[i]>=70))
		x[i]=2;
	
	    if ((scores[i]>=60) && (scores[i]<70))
		x[i]=1;
	
	    if (scores[i]<60)
		x[i]=0; 
       }

	return x;
  
    }

public static void main(String[] args)
  {   
     Second student = new Second();
	 int[] score = {95,51,60,83,74};
	 int[] var = student.checkGrade(score);
	 for(int j=0;j<var.length;j++)
     System.out.println("Your grade is " + var[j] );
    
  }
}