package OOPs;

import java.util.Scanner;

public class ClassExample {

	public static void main(String[] args) {
		Employee obj=new Employee();
		obj.getDetails();
		obj.display();
		
		Calculate obj1= new Calculate();
		obj1.getNumber();
		System.out.println("sum of numbers is ="+obj1.sumOfNumbers());
		System.out.println("product of numbers is ="+obj1.productOfNumber());
		
		System.out.println("============================");

	     System.out.println("Enter the number :");
	     Scanner sc= new Scanner(System.in);
	     int number=sc.nextInt();
	     Pattern obj3= new Pattern();
	     obj3.printPattern(number);
	 


	}

}

class Employee
{   int salary,number;
    String name,department;
	
	void getDetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of employee = ");
		name=sc.next();
		System.out.println("Enter the number of employee = ");
		number=sc.nextInt();
		System.out.println("Enter the department of employee = ");
		department=sc.next();
		System.out.println("Enter the salary of employee = ");
		salary=sc.nextInt();
			
		
	}
	
	void display()
	{
		System.out.println("Employee name : "+name);
		System.out.println("Employee Mobile number : "+number);
		System.out.println("Employee department : "+department);
		System.out.println("Employee salary : "+salary);
	}
	
	
	
	
}
class Calculate
{
	int number,sum=0,product=1;
  void getNumber()
  {
	  System.out.println("===========================");
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the number : ");
	  number=sc.nextInt();
  }
  
  int sumOfNumbers()
  {
	  for(int i=1;i<=number;i++)
	  {
		  sum=sum+i;
	  }
	  return sum;
  }
  
  int productOfNumber()
  {
	  for(int i=1;i<=number;i++)
	  {
		  product=product*i; 
	  }
	  return product;
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  

}