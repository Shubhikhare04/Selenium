package OOPs;

import java.util.Scanner;

public class ConstructorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Number obj= new Number();
		System.out.println("max number is "+obj.findMax());
		

	}

}

class Number
{
	int num1, num2;
     Number()
     {
    	 System.out.println("Eneter 2 numbers: ");
    	 Scanner sc=new Scanner(System.in);
    	 num1=sc.nextInt();
    	 num2=sc.nextInt();   	 
    	 
    	 
     }
     
     public int findMax()
     {
    	 if(num1>num2)
    		 return num1;
    	 else
    		 return num2;
     }
}
