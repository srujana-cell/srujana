package programmingclass;
import java.util.Scanner;

public class Prgm3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		System.out.println("enter the power");
		int pow = sc.nextInt();
		int res = 1;
		for(int i = 1;i <= pow;i++)
		{
			res =res * num;
			
			
			
		}
		System.out.println(res);
		
	}
	

}
