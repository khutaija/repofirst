import java.util.HashSet;

public class Target {
	public int twoSum(int[] nums, int target) {//+15
		HashSet<Integer> number = new HashSet<Integer>();
		int count = 0;
		for (int i = 0; i < nums.length; i++) {

			if (number.contains(target - nums[i]))
				count++;
			number.add(nums[i]);
		}
		return count;
	}

	public static void main(String[] args) {
		Target call = new Target();
		int nums1[] = { 1, 5, 2, 4, 3, 6 };
		int target1 = 7;
		int result = call.twoSum(nums1, target1);
		System.out.println(result);
	}

}
