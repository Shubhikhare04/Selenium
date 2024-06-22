package PractiseExercise;

import java.util.Scanner;

public class ClassExercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Account Number :");
		int acnum=sc.nextInt();
		
		System.out.println("Enter Account Holder Name :");
		String name=sc.next();
		
		System.out.println("Enter Balance amount :");
		double bal=sc.nextDouble();
		
		BankAccount obj= new BankAccount(acnum,name,bal);
		
		System.out.println("Enter how much amount do you want to deposit :");
		double dipositAMT=sc.nextDouble();
		System.out.println("Now available balance is : "+(obj.Deposit(dipositAMT)));
		System.out.println("=======================================");

		System.out.println("Enter how much amount do you want to withdraw :");
		double withdrawAMT=sc.nextDouble();
		System.out.println("Now available balance after withdrawal from account : "+(obj.Withdrawal(withdrawAMT)));
		System.out.println("==================================");
		
		
		System.out.println("Bank fee : "+(obj.bankFee()));
		
		
		

	}

}

class BankAccount
{
int acNum;
String hname;
double bal;
double fee;

BankAccount(int accountNumber, String name, double balance)
{
	
	acNum=accountNumber;
	hname=name;
	bal=balance;
}

 
     double Deposit(double amount)
     {
    	 bal=bal+amount;
    	 return bal;
     }

     double Withdrawal(double amount)
        {
	 bal=bal-amount;
	 return bal;
      }

     double bankFee()
     {
    	 fee=(bal*5)/100;
    	 return fee;
     }



}
