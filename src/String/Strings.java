package String;

public class Strings {

	public static void main(String[] args) {
		String a="pooja";
		String b="pooja";
		String c=new String("pooja");
		String d=new String("pooja");
			System.out.println(a==b);	
			System.out.println(a==c);
			System.out.println(c==b);
			System.out.println(a.equals(b));
			System.out.println(a.equals(c));
			System.out.println(c.equals(b));
	}

}
