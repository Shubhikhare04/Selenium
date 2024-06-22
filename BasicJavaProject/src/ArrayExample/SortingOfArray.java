package ArrayExample;

import java.util.Scanner;

public class SortingOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number[]=new int[5];
		int temp;
		
		System.out.println("Enter 5 number to performe sorting ");
		
		Scanner sc= new Scanner(System.in);
		
		for(int i=0;i<number.length;i++)
		{
			number[i]=sc.nextInt();
		}
		for(int i=0; i<number.length;i++)
		{
			System.out.println("Number array is ="+number[i]);
		}
		
		System.out.println("========================================================");
		for(int i=0;i<number.length;i++)
		{
			for(int j=i+1;j<number.length;j++)
			{
				if(number[i]<number[j])
				{
					temp=number[i];
					number[i]=number[j];
					number[j]=temp;
							
				}
				
			}
		}
		System.out.println("Numbers after sorting ");
		for(int i=0;i<number.length;i++)
		{
			System.out.println(number[i]+"\t");
		}
		

	}

}
