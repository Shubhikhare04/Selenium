package PractiseExercise;

import java.util.Scanner;

public class ArrayExercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x;
		System.out.println("Enter size of array = ");
		Scanner sc= new Scanner(System.in);
		 x=sc.nextInt();
		
		int number[]= new int[x];
		System.out.println("Enter value of array elements = ");
		for(int i=0;i<number.length;i++) 
		{
			
		number[i]=sc.nextInt();
		
		}			
	
	  for(int i=0;i<number.length;i++)
	  {
		 if(number[i]%2!=0)
		 {
			 System.out.println("Odd array elements are = "+number[i]);
		 }
		 else
			 System.out.println("even array elements are = "+number[i]);
		 
	  }
	

	}

}
