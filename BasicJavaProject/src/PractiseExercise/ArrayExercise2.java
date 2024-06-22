package PractiseExercise;

import java.util.Scanner;

public class ArrayExercise2 {

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
		  number[i]=number[i]*number[i]*number[i];
		  System.out.println("Cube of array elements are = "+number[i]);
	  }
	  
	

	}

}
