package String;

public class functionsOfStrings2 {

	public static void main(String[] args) {
		String s1="Aspire";
		String s2="aspire";
		String s3="aspire pune";
		System.out.println(s3.contains(s2));
		System.out.println(s3.isEmpty());
		System.out.println(s3.charAt(0));
		System.out.println(s3.startsWith(s2));
		System.out.println(s2.endsWith(s3));
		System.out.println(s3.indexOf('s'));
		System.out.println(s3.lastIndexOf('e'));
		System.out.println(s3.substring(8));
		String s4=s3+s2;
		System.out.println(s4);
		System.out.println(s3.replace('e', 'E'));
	}

}
