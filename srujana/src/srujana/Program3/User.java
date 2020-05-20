package srujana.Program3;

import java.util.Scanner;

public class User 
{
	public static void main(String[] args)
	{
		AnimalFactory af;
		
		Scanner sc = new Scanner(System.in);
		
		for(;;)
		{
			System.out.println("1.Dog\n2.Cat\n3.Monkey\n4.exit");
			System.out.println("Enter your choice");
			
			int ch=sc.nextInt();
			
			switch(ch)
			{
			 case 1:af.getAnimal("dog").sound();
			 break;
			 case 2:af.getAnimal("cat").sound();
			 break;
			 case 3:af.getAnimal("monkey").sound();
			 break;
			 case 4:System.exit(0);
			 default:System.out.println("invalid choice");
			}
		 }
	 }

}
