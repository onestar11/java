package Hello;
import java.util.Scanner;

public class Hello {
	public static void main(String args[])
	{
		//Creat a Scanner
		Scanner input= new Scanner(System.in);
		
		//Enter annual interest rate in percentage,e.g.,7.25%
		System.out.print("Enter an amount in double,for example 11.56: ");
		double amount=input.nextDouble();
		
		int remainingAmount=(int)(amount*100);
		
		//Find the number of one dollars
		int numberOfOneDollars=remainingAmount/100;
		remainingAmount=remainingAmount%100;
		
		//Find the number of quarters in the remaining amount
		int numberOfQuarters=remainingAmount/25;
		remainingAmount=remainingAmount%25;
		
		//Find the number of dims in the remaining amount
		int numberOfDimes=remainingAmount/10;
		remainingAmount=remainingAmount%10;
		
		//Find the number of nickels in the remaining amount
		int numberOfNickels=remainingAmount/5;
		remainingAmount=remainingAmount%5;
				
		//Find the number of Pennies in the remaining amount
		int numberOfPennies=remainingAmount;
		
		//Display results;
		System.out.println("Your amount "+amount+" consists of ");
		System.out.println("    "+numberOfOneDollars+" dollars");
		System.out.println("    "+numberOfQuarters+" quarters");
		System.out.println("    "+numberOfDimes+" dims");
		System.out.println("    "+numberOfNickels+" nickels");
		System.out.println("    "+numberOfPennies+" pennies");
		
		
	}
}
