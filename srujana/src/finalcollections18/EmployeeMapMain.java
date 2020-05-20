package finalcollections18;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeMapMain 
{
	public static void main(String[] args) 
	{
		Map<Integer, String> m = new HashMap<Integer, String>();
		
		Scanner sc = new Scanner(System.in);
		
		EmployeeDataBase ed = new EmployeeDataBase();
		
		while(true)
		{
			System.out.println("1.Add\n2.Display\n3.Remove\n4.SearchId\n5.DispId\n6.DispName\n7.exit");
			System.out.println("enter your choice");
			
			int ch = sc.nextInt();
			
			switch (ch) 
			{
				case 1:ed.addEmp(m);
						break;
				case 2:ed.disp(m);
						break;
				case 3:ed.delete(m);
						break;
				case 4:ed.searchId(m);
						break;
				case 5:ed.dispId(m);
						break;
				case 6:ed.dispName(m);
						break;
				case 7:System.exit(0);
				
				default:System.out.println("Invalid option");
						break;
			}
		}
		
	}

}
