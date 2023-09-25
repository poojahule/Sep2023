package logicalLoops;
//    *
//   **
//  ***
// ****
//*****
//line =5     star=5    space=4
public class loops1 {
public static void main(String[]args) { 
	//line
	for(int i=1;i<=5;i++)
	{
		//space
		for(int j=4;j>=i;j--) 
		{
			System.out.print(" ");
		}
		//star
		for(int k=1;k<=i;k++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	
}
}
