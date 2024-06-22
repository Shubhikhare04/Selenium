package PractiseExercise;

import java.util.Scanner;

public class FindFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//to find the factorial of a number
		int num,fact=1;
	
		System.out.println("Please enter number to calculate factorial");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
			
		}
		System.out.println("Factorial is :" +fact);
	}

}
