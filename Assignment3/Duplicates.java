/**
	 * Given a sorted array, find whether there are duplicates in it.
	 */
	 class Duplicates
{
 public boolean findDuplicates(int[] nums)//notice the array is sorted. try to make your method faster
 {
	boolean dup = false;
	for(int i=0; i<nums.length; i++)
		for(int j=i+1; j<nums.length; j++)
			if (j!=i && nums[j]==nums[i])
				dup = true;
		
			return dup;
 }
	public static void main(String[] args)
	 {
	  int[] arry = {1,2,3,3,5,7,8,9};
	  Duplicates d = new Duplicates();
	  boolean result = d.findDuplicates(arry);
	  if (result == true)
	  System.out.println("There are duplicates present");
	  else
	  System.out.println("There are no duplicates present");
	 }
}	 
Status API Training Shop Blog About Pricing
© 2016 GitHub, Inc.