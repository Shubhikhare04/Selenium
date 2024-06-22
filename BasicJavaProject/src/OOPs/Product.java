package OOPs;

public class Product {

	int pno,price,qty;
	String pname;
	void productDetails(int pno,String pname,int price, int qty)
	{
		this.pno=pno;
		this.pname=pname;
		this.price=price;
		this.qty=qty;
		
	}
	
	void printDetails()
	{
		System.out.println("product details : ");
		
		System.out.println(pno+" "+pname+" "+price+" "+qty+" ");
	}
	

}
