package interviewPrograms;

public class EvenOddString {

	public static void main(String[] args) {
        String s= "Pooja";
        StringBuffer sbf=new StringBuffer(s);
		sbf.reverse();
		System.out.println(sbf);
        String even = "";
        String odd = "";
        for(int i=0; i<s.length(); i++)
        {
            if(i%2==0)
            {
                even=even + s.charAt(i);
            }
            else
            {
                odd+=s.charAt(i);
            }
        }
        System.out.println("Characters at even index= "+even);
        System.out.println("Characters at odd index= "+odd);

    }

	}

