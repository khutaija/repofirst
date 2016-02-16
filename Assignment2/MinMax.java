/**
 * Find maximum and minimum in a given array, and return the max and min number
 */
public class MinMax {
	public int[] findMinMax(int[] nums) {
		
		if(nums==null||nums.length==0) return null;
		
		int[] result = new int[2];
		result[0] = nums[0];
		result[1] = nums[0];
	       
		for(int i=1; i< nums.length; i++){
	        	if(result[0] < nums[i]){
	        		result[0] = nums[i];
	        	}
	        	if(result[1] > nums[i]){
	        		result[1] = nums[i];
	        	}
		}
		return result;
	}

	public static void main(String[] args) {
		MinMax minmax = new MinMax();
		int[] numbers = { 6, 34, 98, 13, 3, 59, 72, 23, 75 };
		int[] var = minmax.findMinMax(numbers);
		System.out.println("The maximum number is: " + var[0]);
		System.out.println("The minimum number is: " + var[1]);

	}

}
