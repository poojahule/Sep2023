package logicalLoops;
//print number from 1 to 100 which is divisible by 2 & 3
public class for3 {

	public static void main(String[] args) {
		
		for(int i=1;i<=100;i++)
		{
			if(i%2==0 && i%3==0)
			{
				System.out.println(i);
			}
		}

	}

}
