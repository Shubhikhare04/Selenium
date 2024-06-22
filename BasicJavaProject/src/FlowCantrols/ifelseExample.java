package FlowCantrols;

import java.util.Scanner;

public class ifelseExample {

	public static void main(String[] args) {
		
		int n;
		System.out.println("Enter the value of n = ");
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
	
		
		if(n%2==0) 
		{
			System.out.println( n +"is a even number ");	
		}
		else
		{
			System.out.println(n + "is a odd number ");	
			
		}
		System.out.println("-----------------------");
		
		String user, pass;
		System.out.println("Enter User Name = ");		
		user=sc.next();
		System.out.println("Enter Password = ");
		pass=sc.next();
		
		if((user.equals("Admin")) &&(pass.equals("admin@123"))) 
		{
			System.out.println("Sucessfully Loged In");
			
		}
		else{
			System.out.println("Invalid User name or Password");
		}
		
		

	}

}
