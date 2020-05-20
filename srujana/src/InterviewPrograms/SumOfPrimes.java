package InterviewPrograms;

public class SumOfPrimes
{
	//to find given is prime or not
	public static boolean isPrimeNumber(int num) 
	{
		//corner or edge or boundary or border cases
		if(num<=1)
		{
			return false;
		}
		for (int i=2; i<num; i++) 
		{
			if(num%i==0) 
			{
				return false;
			}
		}
		return true;
	}
	//to find prime number range of give number
	public static void getPrimeNumbers(int num)
	{
		int sum=0;
		for(int i=2; i<=num; i++) 
		{
			if(isPrimeNumber(i))
			{
				System.out.println(i+" ");//this is to print the range of prime numbers
				sum+=i;
			}
		}
		System.out.println(sum);//this is to print sum of prime numbers
	}
	
	public static void main(String[] args)
	{
		//calling above methods
		System.out.println("2 is a prime number:"+isPrimeNumber(2));
		System.out.println("13 is a prime number:"+isPrimeNumber(13));
		getPrimeNumbers(20);
		getPrimeNumbers(10);
		
		

	}

}
