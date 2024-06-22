package FunctionExaple;

import java.util.Scanner;

public class userDediniedFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.out.println("Enter 2 numbers to find the max value");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	
	int max=findmax(a,b);
	System.out.println("Max value is : "+ max);
	System.out.println("======================================");
	
	//2nd method calling
	
	int n=sc.nextInt();
	displayTable(n);
	System.out.println("======================================");
	
	//3rd method calling
	System.out.println(login());
	
	//4th method calling
		System.out.println("==================");
		table();
	

	}
	
	//function with arguments with return type
	
	static int findmax(int m,int n)
	{
		if(m>n)
			return m;
		else 
			return n;
	}

	//function with arguments without return type
	
	static void displayTable(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print("*"+"\t");
			}
			System.out.println();
		}
		
	}
	//function without arguments with return type
	
	static String login()
	{
		System.out.println("Enter Username & Password for login");
		Scanner sc =new Scanner(System.in);
		String username= sc.next();
		String password= sc.next();
		
		if((username.equals("Admin"))&&(password.equals("admin@123")))
		{
			return "Login Success";
		}
		else 
			return "Login Failuer";
		
	}
	
	//function without arguments without return type
	static void table()
	{
		System.out.println("enter number ");
		Scanner sc= new Scanner(System.in);
		
		int num=sc.nextInt();
		
		for (int i=1;i<=10;i++)
		{
			System.out.println(i+" * "+num+" = "+(i*num));
		}		
		
		
		
	}
	
	
	
	
}




	



	
