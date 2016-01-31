class Duplicates
{
 public boolean findDuplicates(int[] nums)
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