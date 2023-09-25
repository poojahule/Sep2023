package interviewPrograms;

public class sample {

	public static void main(String[] args) {
		String s="PoOjA";
		for(char ch:s.toCharArray()) {
			if(Character.isUpperCase(ch)) {
				System.out.print(ch);
			}
		}
		System.out.println();
		for(char ch:s.toCharArray()) {
			if(!Character.isUpperCase(ch)) {
				System.out.print(ch);
			}
		}
	}

}
