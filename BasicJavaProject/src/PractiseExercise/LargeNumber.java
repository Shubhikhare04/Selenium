package PractiseExercise;

import java.util.Scanner;

public class LargeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2,n3;
		System.out.println("Please enter 3 number to find large number");
		
		Scanner sc= new Scanner(System.in);
		n1=sc.nextInt();
		n2=sc.nextInt();
		n3=sc.nextInt();
		if((n1>=n2)&&(n1>=n3))
		{
			System.out.println(n1+" is the greatest number ");
		}
		else if ((n2>=n1)&&(n2>=n3))
		{
			System.out.println(n2+" is the greatest number ");
		}
		else 
		{
			System.out.println(n3+" is the greatest number ");
		}
		
	}

}
