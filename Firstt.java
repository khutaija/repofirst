class Firstt{
	
	int N;
	
	public void wierdNumber(int N)
	{
	if(N%2==1)
	System.out.println("Wierd");

	if( (N%2==0) && ((2<=N) && (N<=5)) )
	System.out.println("Not Wierd");

	if( (N%2 == 0) && ((6<=N) && (N<=20)) )
	System.out.println("Wierd");
	
	if((N%2==0) && (N>20))
    System.out.println("Not Wierd");
	}
	
	public static void main(String[] args){
	Firstt number = new Firstt();
	number.wierdNumber(23);
	
	}
}