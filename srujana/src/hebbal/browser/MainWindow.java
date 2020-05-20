package hebbal.browser;

import java.util.Scanner;

public class MainWindow 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		for(;;)
		{
			System.out.println("1.Chrome\n2.Opera\n3.Mozilla\n4.Exit");
			System.out.println("Enter your choice");
			
			int ch=sc.nextInt();
			
			switch(ch)
			{
			 case 1:new Chrome().start();
			 break;
			 case 2:new Opera().start();
			 break;
			 case 3:new Mozilla().start();
			 break;
			 case 4:System.exit(0);
			 default:System.out.println("invalid choice");
		 }
	 }
		
	}	

}
