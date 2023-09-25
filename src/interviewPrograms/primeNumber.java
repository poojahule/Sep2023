package interviewPrograms;

public class primeNumber {

	public static void main(String[] args) {
		int no=15;
		int count=0;
		if(no>1)
		{
			for(int i=1;i<=no;i++)
			{
				if(no%2==1)
					count++;
			}
		}
if(count==no)
{
	System.out.println("no is prime="+count);
}
else
{
	System.out.println("no is not prime="+count);
}
	}

}
