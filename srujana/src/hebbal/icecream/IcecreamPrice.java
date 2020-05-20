package hebbal.icecream;

import java.util.Scanner;

public class IcecreamPrice 
{
	public static void main(String[] args)
	{
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		
		for(;;)
		{
			System.out.println("1.Choclate\n2.Candy\n3.Kulfi\n4.exit");
			System.out.println("Enter your choice");
			
			int ch=sc.nextInt();
			
			switch(ch)
			{
			 case 1:new Choclate().getPrice();
			 break;
			 case 2:new Candy().getPrice();
			 break;
			 case 3:new Kulfi().getPrice();
			 break;
			 case 4:System.exit(0);
			 default:System.out.println("invalid choice");
			 
			 System.out.println("main method ended");
			 
		 }
	 }
		
	}	

}
