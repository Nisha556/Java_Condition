package condition;
import java.util.Scanner;

public class Test {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int roll;
		System.out.println("Enter roll no");
		roll= sc.nextInt();
		switch (roll)
		{
		case 101:
		System.out.println("Student name : Ramesh");
		break;
		case 102:
			System.out.println("Student name : Mukesh");
			break;
		case 103 :
			System.out.println("Student name : Shyam");
			break;
			default :
				System.out.println("Not Found");
		
		}
		
	}
}
