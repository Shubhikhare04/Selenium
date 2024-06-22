package FlowCantrols;

public class forLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		for(int a=1;a<=10;a++) {
			System.out.println("Value of A : "+a);
		}
		
		System.out.println("=========================");
		
		for(int a=10;a>=0;a--) {
			System.out.println("Value of A : "+a);
		}
		System.out.println("=========================");
		for(int a=1;a<=10;a++)
		{
			if(a==5) 
			{ break;
			}
			
			System.out.println("Value of A : "+a);
		}
		
		System.out.println("=========================");
		
		for(int a=1;a<=10;a++)
		{
			if(a==5) 
			{ continue;
			}
			
			System.out.println("Value of A : "+a);
		}

	}

}
