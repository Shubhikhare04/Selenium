package FlowCantrols;

import java.util.Scanner;

public class nestedIfExample {

	public static void main(String[] args) {

 
		int n;
		
		System.out.println("Enter value name of n");
		
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		 if(n%2==0)
		 {
			 if(n%5==0)
			 {
				 System.out.println("N is divided by 2 and 5");
			 }
			 else
				 System.out.println("N is divided by  2");
				 
		 }
		 else
		 {
			if(n%5==0)
			{
				 System.out.println("N is  divided by 5");
			 }
			else
				 System.out.println("N is not  divided by 2 and 5");
		 }
				

	}

}
