package FlowCantrols;

import java.util.Scanner;

public class switchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b;
		char choice;
		System.out.println("Enter the value of a and b");
		Scanner sc= new Scanner(System.in);
		
		a=sc.nextInt();
		b=sc.nextInt();
		
		System.out.println("Please enter choice [+,-,*,/ ] Press # to exit");
		choice= sc.next().charAt(0);
		
		switch(choice)
		{
		case '+':
			System.out.println("sum of A and B is =" +(a+b));	
			break;
		
		case '-':
			System.out.println("Difference  of A and B is =" +(a-b));	
			break;
		case '*':
			System.out.println("Product of A and B is =" +(a*b));	
			break;
		case '/':
			System.out.println("Division of A and B is =" +(a+b));	
			break;
		case '#':
			System.exit(1);
			break;
					
			default:
				System.out.println("invalid choice ");
		
		
		
		}
		
				

	}

}
