package condition;

public class Nochange {
	public static void main(String args[])
	{
		int num[]= {1,2,3,4};
	 int	sum = 0;
	 for(int x: num)
	 {
		 System.out.println(x +"");
		sum= x * 10;
		
	 }
	 System.out.println("value" +sum);
	
	 System.out.println();
	 for(int x : num)
	 System.out.print(x + " ");
	 System.out.println();
		
	}

}
