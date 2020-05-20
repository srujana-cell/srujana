package ban.rootclass;

import java.util.Scanner;

public class BookLibray
{
			public Book[] readBookDetails()
			{
				Book[] b = new Book[5];
				
				String name,author;
				double price;
			    Scanner sc = new Scanner(System.in);
				
				for(int i = 0 ; i < b.length; i++)
				{
					System.out.println("Enter the book name");
					name = sc.nextLine();
					
					System.out.println("Enter the author name");
					color = sc.nextLine();
					
					System.out.println("Enter the book price");
					price = sc.nextDouble();
					
					b[i] = new Book(name, author, price);
					
					sc.nextLine();
				}
				return(Book[] b);
			}
			
			public void dispBookDetails(book[] b)
			{
				System.out.println("name\t\tauthor\t\tprice");
				System.out.println("-------------------------------------------------");
				
				for(int i=0; i<c.length;i++)
				{
					System.out.println(b[i]);
				}
				
			}
			
			public void dispBookPrice(book[] b)
			{
				System.out.println("books b/w 250 to 500/- !!");
				System.out.println("--------------------------------------------------");
				
				for(int i= 0 ; i<b.length;i++)
				{
					if(b[i].getPrice().equals("red"))
					{
						System.out.println(b[i]);
					}
				}
			}
			
			public void authorPadmaReddy(book[] b)
			{
				System.out.println("books with authors");
				System.out.println("----------------------------------------------------");
				
				for(int i= 0 ; i<b.length;i++)
				{
					if(b[i].getauthor().equals("PadmaReddy"))
					{
						System.out.println(b[i]);
					}
				}
				
				
			}
			
			public void authorJavaBooks(book[] b)
			{
				System.out.println("authors who has written java");
				System.out.println("----------------------------------------------------");
						
				for(int i= 1; i<b.length; i++)
				{
					if(b[i].getPrice().equals("Java"))
					{
						System.out.println(b[i]);
					}
				}
			}
}
