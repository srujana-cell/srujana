package programmingclass;

public class Prgm1 
{
	public static void main(String[] args) 
	{
		for(int i = 1 ; i < 21 ;i++ )
		{
			if(i % 3 == 0 && i % 5 ==0)
				System.out.println("AB");
			else if(i % 5 == 0)
				System.out.println("B");
			else if(i % 3 == 0)
				System.out.println("A");
			else
				System.out.println(i);
			
		}
		
	}

}
