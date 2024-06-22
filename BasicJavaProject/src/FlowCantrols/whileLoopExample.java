package FlowCantrols;

import java.util.Scanner;

public class whileLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c,d;
		
		System.out.println("Enter the value of A ");
		Scanner sc= new Scanner(System.in);
		a= sc.nextInt();
		
		while(a<=10)
		{
			System.out.println("A value is : " + a);
			a++;
			
		}
		System.out.println("------------------------------");
		System.out.println("Enter the value of B ");

		b= sc.nextInt();
		while(b>=10)
		{
			System.out.println("B value is : " + b);
			b--;
			
		}
		System.out.println("------------------------------");
		System.out.println("Enter the value of C ");

		c= sc.nextInt();
		while(c<=10)
		{
			System.out.println("C value is : " + c);
			c+=2;
			
		}
		
		System.out.println("------------------------------");
		System.out.println("Enter the value of D ");
		d= sc.nextInt();
          //d=2
        int sum=0;
        
		while(d<=10) //2<10
		{
			sum=sum+d; //2+3
			
			
			d++; //3 // 
			
			
			
			
		}
		System.out.println("Sum value is : " + sum); //2 //5

	}

}
