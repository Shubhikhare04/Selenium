package OOPs;

import java.util.Scanner;

public class Polymorphism {

	public static void main(String[] args) {
		
		Item obj=new Item();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of M :");
		int m=sc.nextInt();
		System.out.println("Enter the value of N :");
		int n=sc.nextInt();
		System.out.println("sum of M and N : "+(obj.sum(m,n)));
		
		System.out.println("================================");
		System.out.println("Enter the value of P :");
		double p=sc.nextDouble();
		System.out.println("Enter the value of Q :");
		double q=sc.nextDouble();
		System.out.println("Enter the value of r :");
		double r=sc.nextDouble();
		
		System.out.println("sum of P,q, and R : "+(obj.sum(p,q,r)));
		
		System.out.println("================================");
		System.out.println("Enter First Name :");
		String  fname=sc.next();
		System.out.println("Enter Last Name :");
		String  lname=sc.next();
		
		
		obj.sum(fname,lname);
		
		Product obj1=new Product();
		System.out.println("====================================");
		System.out.println("enter product number : ");
		int pno=sc.nextInt();
		
		System.out.println("enter product name : ");
		String pname=sc.next();
		
		System.out.println("enter product price : ");
		int price=sc.nextInt();
		
		System.out.println("enter quantity name : ");
		int qty=sc.nextInt();
		
		obj1.productDetails( pno, pname, price,  qty);
		obj1.printDetails( );	
		
		
		

	}


}

class Item
{
 int sum(int m, int n)
 {
	 return(m+n);
 }
 
 double sum(double p,double q,double r)
 {
	 return (p+q+r);
	 
 }
 
 void sum(String Fname, String Lname)
 {
	 System.out.println("Name:"+(Fname+Lname));
 }
}