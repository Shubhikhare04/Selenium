package PractiseExercise;

import java.util.Scanner;

public class FunctionProgram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter number to calculate factorial =");
		Scanner sc= new Scanner(System.in);
		int number=sc.nextInt();
		int fact=Fact(number);
		System.out.println("Factorial of number is = "+fact);
		
	    

	}

	 static int Fact(int number)
	{
		int fact=1;
		for(int i=1;i<=number;i++) {
			fact=fact*i;			
		}
		
		return fact;
		
	}
}
