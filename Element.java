
class Element
{
	public int[] deleteElement(int[] nums, int index)
	{ 
		int[] newArray;
		newArray = new int[nums.length-1];
		for(int i=0; i<nums.length-1; i++)
		{
      	if((i==index) || (nums[i]==0))
      	{
               newArray[i]=nums[i+1];
      			nums[i+1] = 0;
      	}
      			else
      				newArray[i] = nums[i];
        }

            return newArray;
	}
	public static void main(String[] args)
	{   
		Element e = new Element();
		int[] input = {1, 2, 3, 4, 5,6,7};
		int index;
		index = 5;
		int[] var = e.deleteElement(input, index);
		System.out.println("New array after removing the element at the specified index");
		for(int j=0; j<var.length; j++)
			System.out.println(var[j]);

	}
}