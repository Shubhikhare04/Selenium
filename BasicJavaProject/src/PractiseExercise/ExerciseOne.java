package PractiseExercise;

import java.util.Scanner;

public class ExerciseOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//to find out the average of a set of integers
		
		int i1,i2,i3,i4,i5;
		float avg;
		Scanner sc=new Scanner(System.in);		
		System.out.println("Please Enter 5 Numbers : ");		
		i1=sc.nextInt();
		i2=sc.nextInt();
		i3=sc.nextInt();
		i4=sc.nextInt();
		i5=sc.nextInt();
		avg=(i1+i2+i3+i4+i5)/5;
		System.out.println("Average of 5 numbers is : "+avg);
		
		System.out.println("=============================  : ");
		
		
		//to find the average of 10 numbers using while loop
		int sum=0,a=1,n;
		float average;	
		System.out.println("Please Enter 10 Numbers : ");	
		while( a<=10)
		{
			//System.out.println(a+" Number is: ");
			n=sc.nextInt();
			sum+=n;
			a++;			
			
		}
		average=sum/10;
		System.out.println(" Sum of 10 numbers are :"+sum);
		System.out.println(" Average of 10 numbers is :"+average);
		
		
		
	
		
		
		
		
		
		
		

	}

}
