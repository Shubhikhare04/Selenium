package ArrayExample;

import java.util.Scanner;

public class TwoDimessionsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] numbers=new int[3][2];
		
		numbers[0][0]= 1;
		numbers[0][1]= 2;
		
		numbers[1][0]= 3;
		numbers[1][1]= 4;
		numbers[2][0]= 5;
		numbers[2][1]= 6;
		
		for(int i=0;i<numbers.length;i++)
		{
			for(int j=0;j<numbers[i].length;j++)
			{
				System.out.print(numbers[i][j]+"\t");
			}
			System.out.println();
			
		}
		
		String data[][]=new String[5][5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter data");
		
		for(int i=0;i<data.length;i++)
		{
			for(int j=0;j<data[i].length;j++)
			{
				data[i][j]=sc.next();
			}
				
		}
		System.out.println("=====================================");
		
		for(int i=0;i<data.length;i++)
		{
			for(int j=0;j<data[i].length;j++)
			{
				System.out.print(data[i][j]+"\t");
			}
			System.out.println();
			
		}
		
	}

}
