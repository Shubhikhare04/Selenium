package PractiseExercise;

import java.util.Scanner;

public class FindTheMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//to check whether the given integer is a multiple of 5

	//	to check whether the given integer is a multiple of both 5 and 7
		int num;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter the number:");
		num=sc.nextInt();
		
		if(num%5==0)
		{
			if((num%5==0)&&(num%7==0)) 
			{
				System.out.println(num+" is multiple of 5 and 7");
			}
			else
			{
				System.out.println(num+" is multiple of 5");
			}
			
		}
		else
		{
			if(num%7==0)
			{
				System.out.println(num+" is multiple of 7");
			}
			else
			{
				System.out.println(num+" is not multiple of 5 and 7");
			}
		}
			
		//to display all the multiples of 3 within the range 10 to 50
		
		System.out.println("==============================================");
		System.out.println("Multiple of 3 from 10 to 50 are-");
		for(int i=10;i<=50;i++)
		{
		   if(i%3==0) {
			   System.out.println(i);
		   }
			
		}
		
		
		
		
		
		
		
		
		
		

	}

}
