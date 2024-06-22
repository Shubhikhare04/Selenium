package ArrayExample;

import java.util.Scanner;

public class AvgSumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number[] = new int[5];
		int sum=0,avg=0,max,min;
		
		System.out.println("Please enter 5 numbers to calcuate avrage and sum ");
		
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<number.length;i++)
		{
			number[i]=sc.nextInt();
			sum=sum+number[i];	
			
		}
		for(int i=0;i<number.length;i++)
		{
			System.out.print(number[i]+"\t");
		}
		
		System.out.println("==========================");
		
		
		System.out.println("Sum of array is= "+sum);
		System.out.println("Average of array is=  "+sum/number.length);
		
		
		max=number[0];
		min=number[0];
		
		for(int i=0;i<number.length;i++)
		{
			if(number[i]>max) {
				max=number[i];
			}
			if(number[i]<min)
			{
				min=number[i];
			}
			
		}
		System.out.println("maximum value of array elements =" +max);
		System.out.println("minimum value of array elements =" +min);

	}

}
