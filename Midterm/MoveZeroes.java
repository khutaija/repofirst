public class MoveZeroes {
	public void moveZeroes(int[] nums) {
		if (nums.length == 0)
			return;
		int position = -1;
		int temp = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0)
				continue;
			else
				temp = nums[i];
			nums[i] = nums[++position];
			nums[position] = temp;

		}
		for (int j = 0; j < nums.length; j++)
			System.out.println(nums[j]);
	}

	public static void main(String[] args) {

		int[] nums1 = { 0, 1, 0, 3, 12, 0, 9, 8, 0, 0 };
		MoveZeroes call = new MoveZeroes();
		call.moveZeroes(nums1);

	}

}