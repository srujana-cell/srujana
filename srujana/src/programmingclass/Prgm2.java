package programmingclass;

import java.util.Scanner;

public class Prgm2 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("enter the upper limit");
		int upper = in.nextInt();
		int count = 0;
		for(int i = 1; count < upper ; i++)
		{
			if(i % 2 != 0)
			{
				System.out.println(i);
				count++;
				
			}
		}
		in.close();
		
	}

}
