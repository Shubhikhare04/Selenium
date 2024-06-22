package FlowCantrols;

import java.util.Scanner;

public class ifelseifExample {

	public static void main(String[] args) {

		//if->else if-> 
		
		int n1,n2,n3,n4,n5,avg,total;		

		System.out.println("Enter n1,n2,n3,n4 and n5");
		Scanner sc= new Scanner(System.in);
		 n1=sc.nextInt();
		 n2=sc.nextInt();
		 n3=sc.nextInt();
		 n4= sc.nextInt();
		 n5= sc.nextInt(); 
		 
		total=n1+n2+n3+n4+n5;
		avg=total/5;
		
		System.out.println(  "Total is"  + total);
		System.out.println(  "Average is" +  avg);
		
		if(avg>=80)
		{
			System.out.println("A Grade");
		} 
		else if (avg>=70)
		{
			System.out.println("B Grade");
		}
		else if (avg>=50)
		{
			System.out.println("C Grade");
		}
		else
		{
			System.out.println("D Grade");
		}
	}

}
