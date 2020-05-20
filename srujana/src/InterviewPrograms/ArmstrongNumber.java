package InterviewPrograms;

public class ArmstrongNumber
{
	public static void isArmstrongNumber(int num)
	{
		System.out.println("given number is"+num);
		int cube = 0;
		int r,t;
		t = num;
		while (num>0) 
		{
			r=num%10;
			num=num/10;
			cube=cube+(r*r*r);
		}
		if(t==cube)
		{
			System.out.println("this is an ArmstrongNumber");
		}
		else 
		{
			System.out.println("this is not an ArmstrongNumber");
		}
	}
	public static void getArmstrongNumber(int num)
	{
		int sum=0;
		for(int i=2; i<=num; i++) 
		{
			if(isArmstrongNumber(numl))
			{
				System.out.println(i+" ");//this is to print the range of prime numbers
				sum+=i;
			}
		}
		System.out.println(sum);//this is to print sum of prime numbers
	}
	public static void main(String[] args)
	{
		isArmstrongNumber(153);

	}

}
