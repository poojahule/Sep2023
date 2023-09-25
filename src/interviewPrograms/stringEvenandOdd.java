package interviewPrograms;

public class stringEvenandOdd {

	public static void main(String[] args) {
	
		
			String s="jadhav";
			StringBuffer sbf=new StringBuffer(s);
			sbf.reverse();
			System.out.println(sbf);
			int i=0;
			System.out.println("\neven charectors");
			if(i%2==0)
			{
				char ch=s.charAt(i);
				System.out.println(ch);
			}
			
//			System.out.println("\nodd charectors");
//			else
//			{
//				char c=s.charAt(j);
//				System.out.println(c);
//			}
	}

}
