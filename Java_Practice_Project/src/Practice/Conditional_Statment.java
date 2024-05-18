package Practice;
import java.util.Scanner;

public class Conditional_Statment {
	
	
	
	public static void main(String[]args)
	{

//1. Write a Java program to get a number from the user and print whether it is positive or negative. 
		
		
		Scanner MyScanner = new Scanner(System.in);
		
		System.out.println("Enter your Value in Numbers");
		int UserValue = MyScanner.nextInt();
		
		if(UserValue>0)
		{
			System.out.println("User Entered value Postive");
		}
		
		else 
		{
			System.out.println("User Entered Value Negatieve");
			
			
		}
		
		// 3. Write a Java program that takes three numbers from the user and prints the greatest number. 
		
		System.out.println("Enter One Value");
		int ValueOne = MyScanner.nextInt();
		
		System.out.println("Enter Two value");
		int ValueTwo = MyScanner.nextInt();
		
		System.out.println("Enter Three Value");
		int ValueThree = MyScanner.nextInt();
		
		if (ValueOne > ValueTwo || ValueOne >ValueThree)
		{
			System.out.println("Value One is Greatest Number");
		}
		
		
		else if (ValueTwo > ValueOne || ValueTwo > ValueThree)
		{
			System.out.println("Value Two is Greatest Number");
		}
		
		
		
		else if (ValueThree > ValueOne || ValueThree > ValueTwo)
		{
			
			System.out.println("Value Three is Greatest Number");
		}
		
		
		
		
		
		
		
		
		
	}
	 
	

}
