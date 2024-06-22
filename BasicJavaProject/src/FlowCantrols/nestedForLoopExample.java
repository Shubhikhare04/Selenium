package FlowCantrols;

public class nestedForLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=5;i++) 
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(i+"  "+j+"   ");
			}
			System.out.println();
		}
System.out.println("=======================================");
		
		for(int i=1;i<=5;i++) 
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(" * "+"   ");
			}
			System.out.println();
		}
		
System.out.println("=======================================");
		int n=1;
		for(int i=1;i<=5;i++) 
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(n +"  ");
				n+=1;
			}
			System.out.println();
		}
		
	}
	

}
