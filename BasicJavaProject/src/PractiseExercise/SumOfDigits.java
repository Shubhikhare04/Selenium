package PractiseExercise;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num,sum=0,i=0;
		System.out.println("Please enter number:");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		
		while(num!=0)
		{
		sum=sum+num%10;
		System.out.println("1 sum:"+sum);
		
		num=num/10;
		System.out.println("1 num:"+num);
		
		
		}
		System.out.println("sum of digits is : "+sum);
		
		//to display all integers within the range 100-200 whose sum of digits is an even number
		
		
		
	}

}
