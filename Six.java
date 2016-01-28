class Six
{
/*You just need to find the min and max, but needn't sort the whole array.
Your code is great. It's my fault that I didn't describe the question clearly.*/
  public int[] findMinMax(int[] nums)
  {  
	int temp;
	for(int j=0;j<nums.length-1;j++){
	for(int i=0; i<nums.length-1;i++){
	if( nums[i] > nums[i+1] )
	  {
	    temp = nums[i];
	    nums[i] = nums[i+1];
	    nums[i+1] = temp;
      }
     }
    }
   return nums;
  }
	public static void main(String[] args)
	{
		Six minmax = new Six();
		int[] numbers = {6,34,98,13,3,59,72,23,75};
		int[] var = minmax.findMinMax(numbers);
		System.out.println("The minimum number is: " + var[0]);
		System.out.println("The maximum number is: " + var[var.length-1]);

	}
}
