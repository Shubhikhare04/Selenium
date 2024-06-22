package PractiseExercise;

import java.util.Scanner;

public class ArrayExercise1 {

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
	
	   for(int i=number.length-1;i>=0;i--)
	   {
		   System.out.println("revers order of array element is - "+number[i]+"\t"); 
	   }
		
		

	}

}
