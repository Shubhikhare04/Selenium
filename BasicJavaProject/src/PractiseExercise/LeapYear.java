package PractiseExercise;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int leapyear;
		System.out.println("Please enter year ");
		Scanner sc= new Scanner(System.in);
		leapyear=sc.nextInt();
		
		if(leapyear%4==0)
		{
			System.out.println(leapyear+ " is a leap year ");	
		}
		else 
			System.out.println(leapyear+ " is not a leap year ");	
		

	}

}
