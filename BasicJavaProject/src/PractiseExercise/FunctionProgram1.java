package PractiseExercise;

import java.util.Scanner;

public class FunctionProgram1 {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
  
		System.out.println("Enter the numbers");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		displayNumber(number);
	}
	
	 static void displayNumber(int number)
	
	{
		for(int i=0;i<=number;i++)
		{
			System.out.print("*"+"\t");
		}
	}

}
