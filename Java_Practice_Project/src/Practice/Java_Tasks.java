package Practice;

import java.util.Scanner;

public class Java_Tasks {

	
	public static void main (String[]args)
	{
		
		Java_Tasks.Find_greatest_num();
		
		
		
		
	}
	
	
	//  Write a Java program that takes three numbers from the user and prints the greatest number. 
	
	public static void Find_greatest_num()
	{
		Scanner MY_Scanner = new Scanner(System.in);
		
		System.out.println("Please Enter your First Value");
		int Value_One = MY_Scanner.nextInt();
		
		System.out.println("Please Enter your Second Value");
		int Value_Two = MY_Scanner.nextInt();
		
		System.out.println("Please Enter your Three Value");
		int Value_Three = MY_Scanner.nextInt();
		
		
		if (Value_One > Value_Two)
		{
			if (Value_One > Value_Three)
			{
				System.out.println("Value one is Greate Number");
		}
			
			
			
			else	if (Value_Two > Value_One)
			{
				if (Value_Two > Value_Three)
				{
					System.out.println("Value Two  is Greate Number");
			}
			
				
				else	if (Value_Three > Value_One)
				{
					if (Value_Three > Value_Two)
					{
						System.out.println("Value Three  is Greate Number");
				}
				}}}}}
				


			
			
		
	
		
	


