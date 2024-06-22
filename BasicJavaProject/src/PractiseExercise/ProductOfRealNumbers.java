package PractiseExercise;

import java.util.Scanner;

public class ProductOfRealNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to find the product of a set of real numbers
		
		        int countRN,product=1,b=1,realnumber;
		        Scanner sc= new Scanner(System.in);	
			    System.out.println("Please enter count of real number");
				countRN=sc.nextInt();
				System.out.println("Please enter"+countRN+" real numbers : ");	
				while( b<=countRN)
				{
					//System.out.println(a+" Number is: ");
					realnumber=sc.nextInt();
					product*=realnumber;
					b++;			
					
				}
				System.out.println("Product of "+countRN+"real numbers is"+product);

	}

}
