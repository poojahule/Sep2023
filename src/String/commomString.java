package String;

public class commomString {
	
		public static void main(String[] args) {
		String s1 = "pooja";
		String s2 = "puja";

		System.out.print("Common characters: ");
		for (int i = 0; i < s1.length(); i++) {
		char ch = s1.charAt(i);
		if (s2.indexOf(ch) != -1)

		//if (s2.contains(String.valueOf(ch)))
		{
		System.out.print(ch + " ");
		//System.out.println(Character.toUpperCase(ch)+"");
		}
		}
		}
		}

