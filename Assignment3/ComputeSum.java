/**
	 * Return the sum of a given array. You may assume the sum will not overflow.
	 */

	 public class ComputeSum
{
	public int sumArray(int nums[])
    {
	 int sum=0;
	 for(int i=0; i<nums.length; i++)
	 sum = sum + nums[i];
	 return sum;	
    }


public static void main(String[] args)
{
	 ComputeSum add = new ComputeSum();
	int[] numbers = {4,17,8,31,9,6};
	int result;
	result = add.sumArray(numbers);
	System.out.println("The sum of all the numbers in the array is " + result);
}
}