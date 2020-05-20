package Patterns;

import java.util.Scanner;

public class SqarePattern 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int size = sc.nextInt();
		int t1 = size;//for *
		int t2 = 0;//for #
		for (int i = 0; i < size; i++) 
		{
			if (i <= size/2) 
			{
				t1--;
				t2++;
				
				if (i%2==0)//even rows 
				{
					for (int n = 0; n < t1; n++) 
					{
						System.out.println("*");
					}
					for (int m = 0; m < t2; m++) 
					{
						System.out.println("#");
					}
				}
				else //odd rows
				{
					for (int m = 0; m < t2; m++) 
					{
						System.out.println("#");
					}
					for (int n = 0; n < t1; n++) 
					{
						System.out.println("*");
					}
				}
					
				
				System.out.println();
					
					
			}
			else
			{
				t1++;
				t2--;
				
				if (i%2==0) 
				{
					for (int n = 0; n < t1; n++) 
					{
						System.out.println("*");
					}
					for (int m = 0; m < t2; m++) 
					{
						System.out.println("#");
					}
				}
				else 
				{
					for (int m = 0; m < t2; m++) 
					{
						System.out.println("#");
					}
					for (int n = 0; n < t1; n++) 
					{
						System.out.println("*");
					}
				}
			
				
			System.out.println();
					
					
					
			}
		}
	}
}



/*		* * * * #
		# # * * *
		* * # # #
		# # * * *
		* * * * #	   */
	
	




