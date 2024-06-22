package PractiseExercise;

import java.util.Scanner;

public class FunctionExcercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc= new Scanner(System.in);
		
        boolean result;
        int count=0;
        System.out.println("How many times do you want to check .. ");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++)
        {
        	System.out.println("Please enter Charater from A to Z");
        	char value=sc.next().charAt(0);
        	result=countChar(value);
        
				if(result==true) {
					System.out.println(value+" is upper letter");
					count++;
				}
				else
				System.out.println(value+" is not upper letter");
		
        }
		System.out.println("Number of Upper case letters " + count);
		
	}
		
		
		
	
	
	

	static boolean countChar(char c)
	{
		
		if((c>='A')&&(c<='Z')) {
			
			
			return true;
		}
		else 
			return false;
				
	}
	
}
