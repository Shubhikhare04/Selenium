package ArrayExample;

import java.util.Scanner;

public class SingleDimessionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] ={1,2,3};
		String name[]={"Shubhi","Khare","Shrivastava"};
		float  numbers[]= {1.1f,1.2f,1.3f};
		
		System.out.println("=====Printing all array without loop=====");
		
		System.out.println("a[0]"+a[0]);
		System.out.println("a[1]"+a[1]);
		System.out.println("a[2]"+a[2]);
		
		System.out.println("name[0]"+name[0]);
		System.out.println("name[1]"+name[1]);
		System.out.println("name[2]"+name[2]);

		System.out.println("numbers[0]"+numbers[0]);
		System.out.println("numbers[1]"+numbers[1]);
		System.out.println("nanumbersme[2]"+numbers[2]);
		
		
		System.out.println("=====Printing all array with for loop=====");
		for(int i=0;i<a.length;i++)
		{
			System.out.println("a[i] = "+a[i]);
		}
		
		for(int i=0;i<name.length;i++)
		{
			System.out.println("name[i]"+name[i]);
		}
		for(int i=0;i<numbers.length;i++)
		{
			System.out.println("numbers[i]"+numbers[i]);
		}
		
		System.out.println("=====Taking input from user=====");
		int a1[]= new int[5];
		System.out.println("=====Please enter numbers values=====");
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<a1.length;i++)
		{
			a1[i]=sc.nextInt();
		}
		
		for(int i=0;i<a1.length;i++)
		{
			System.out.println("a1[i] = "+a1[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
