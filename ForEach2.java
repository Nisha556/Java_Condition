package condition;

public class ForEach2 {
public static void main(String args[])
{
	int nums[] = {1,2,5,8,6};
int 	sum= 0;
	for( int x: nums)
	{
		System.out.println("enter the valus of x" +x);
		sum= sum+x;
		System.out.println("the value of sum" +sum);
	if(x==8)
		break;
	
	}
	System.out.println("final value" +sum);
}
}
