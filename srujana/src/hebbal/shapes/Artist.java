package hebbal.shapes;

import java.util.Scanner;

public class Artist 
{
	public static void main(String[] args)
	{
		ShapeFactory sf
		
		Scanner sc = new Scanner(System.in);
		
		for(;;)
		{
			System.out.println("1.Circle\n2.Square\n3.Rectangle\n4.exit");
			System.out.println("Enter your choice");
			
			int ch=sc.nextInt();
			
			switch(ch)
			{
			 case 1:af.getShape("Circle").draw();
			 break;
			 case 2:af.getShape("Square").draw();
			 break;
			 case 3:af.getShape("Rectangle").draw();
			 break;
			 case 4:System.exit(0);
			 default:System.out.println("invalid choice");
		 }
	 }

}
