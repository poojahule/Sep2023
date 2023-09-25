package logicalLoops;
//*        1
//**       11
//***      111
//****     1111
//*****    11111

public class for4 {

	public static void main(String[] args) {
		int stars=5;
		int lines=5;
				
		for(int i=1;i<=lines;i++)
		{
			
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	   }

   }
}
