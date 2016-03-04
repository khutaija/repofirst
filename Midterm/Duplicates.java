import java.util.HashSet;

public class Duplicates {
	
	public boolean containsDuplicate(int[] nums)
	{
		HashSet hashSet = new HashSet();
		for(int i=0; i<nums.length; i++)
		{
			hashSet.add(nums[i]);
		}
		if(hashSet.size()==nums.length)
			return false;
		return true;
	}

	public static void main(String[] args) {
		Duplicates call = new Duplicates();
		int[] input = {1,3,2,1,5,6,};
		boolean result = call.containsDuplicate(input);
		System.out.println("Duplicates present : " +result);

	}

}
