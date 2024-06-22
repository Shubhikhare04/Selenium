package PractiseExercise;

import java.util.Scanner;

public class SumOfDigitsEvenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//to display all integers within the range 100-200 whose sum of digits is an even number
		
		
		//System.out.println("Please enter number:");
		//Scanner sc=new Scanner(System.in);
		//num=sc.nextInt();
		/*int sum=0;
		
		for (int i=100;i<=110;i++) {
			
			
			while(i!=0) {
				sum=sum+i%10;
				i=i/10;
			}
			
			
			if(sum%2==0)
			{
				System.out.println("even number"+sum);
			}
			
			
		}*/
		
		//to find the odd numbers in between 50 to 100
		
		for(int i=50;i<=100;i++) {
			if(i%2!=0)
			{
				System.out.println(i +"  is odd number");
				
			}
		
				
		}
		
		

	}

}
