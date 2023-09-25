package String;

public class StringReverse {

	public static void main(String[] args) {
		String s="Bhagwat Gangadhar Jadhav";
		String[] sar = s.split("");
		String rev ="";
		for(int i=sar.length-1;i>=0;i--)
		{
			rev=rev+sar[i];
		}
		System.out.println(rev);
	}

}
