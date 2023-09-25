package logicalprograms;
//switch two numbers value 1.with third variable    2.without third variable
public class switch3 {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		//using third variable
			//int temp;
			//temp=a;
			//a=b;
			//b=temp;
			//System.out.println(a);
			//System.out.println(b);
		
//without using third variable
      a=a+b;
      b=a-b;
      a=a-b;
      System.out.println(a);
      System.out.println(b);
}
}
