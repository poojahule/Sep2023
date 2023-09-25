
package methods;

public class parameterizedMethod {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		addition(2,3);
		int c= multiplication(20,30);
		System.out.println(c);
	}
	public static int addition(int i, int j) {
		int sum=i+j;
		System.out.println(sum);
		return sum;
		
	}

	public static int multiplication(int p, int q) {
		 int multi=p*q;
			System.out.println(multi);
			return multi;
			
	}

}
