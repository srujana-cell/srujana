package srujana.animal;

import java.util.Scanner;

public class Menuoption 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		for(;;)
		{
			System.out.println("1.Dog\n2.Cat\n3.Monkey\n4.exit");
			System.out.println("Enter your choice");
			
			int ch=sc.nextInt();
			
			switch(ch)
			{
			 case 1:new Dog().sound();
			 break;
			 case 2:new Cat().sound();
			 break;
			 case 3:new Monkey().sound();
			 break;
			 case 4:System.exit(0);
			 default:System.out.println("invalid choice");
		 }
	 }
		
	}	
	

}
