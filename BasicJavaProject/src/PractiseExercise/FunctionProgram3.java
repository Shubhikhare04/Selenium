package PractiseExercise;

import java.util.Scanner;

public class FunctionProgram3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int power;
		System.out.println("Enter value of X =");
		System.out.println("Enter value of Y =");
		Scanner sc=new Scanner(System.in);
		int X=sc.nextInt();
		int Y=sc.nextInt();
		power=POWER(X,Y);
		
		System.out.println("Value of X power of y is = "+power);
		
		

	}
	
	 static int POWER(int x ,int y)
	{
		int power=1;
		for(int i=0; i<y;i++)
		{
			power=power*x;
		}
		
		
		return  power;
		
	}
	

}
