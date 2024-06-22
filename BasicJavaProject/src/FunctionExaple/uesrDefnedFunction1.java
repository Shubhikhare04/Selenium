package FunctionExaple;

import java.util.Scanner;

public class uesrDefnedFunction1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the value of array");
		String data[][]= new String[2][2];
		
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<data.length;i++)
		{
			for(int j=0;j<data[i].length;j++)
			{
				data[i][j]=sc.next();
			}
		}
		displayArray(data);

		//2nd method calling
		System.out.println("=================================");
		System.out.println("Enter array elements ");
		int value[]= new int[5];
		
		for(int i=0;i<value.length;i++)
		{
			value[i]=sc.nextInt();
		}
		int sum=calculate(value);
		System.out.println("sum of array elements  = "+sum);
		
		System.out.println("Averag of array element = "+(sum/value.length));
		
	}
	
	static void displayArray(String array[][]) 
	{
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[i].length;j++)
			{
				System.out.print(array[i][j]+"\t");
				
			}
			System.out.println();
		}
	}
	
	static int calculate(int number[])
	{
		int sum=0;
		for(int i=0;i<number.length;i++)
		{
			sum=sum+number[i];
		}
		return sum;
				
	}

}
