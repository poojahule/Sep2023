package constructor;

public class Sample3 {
	int a;
	int b;
	public Sample3()
	{
		a=10;
		b=20;
		int sum=a+b;
		System.out.println(sum);
	}
	public static void main(String[] args) {
		Sample3 object= new Sample3();
		int c=30;
		System.out.println(c);
		System.out.println(object.a);
	}
}