package StringBuffer;

public class StringBufferclass {

	public static void main(String[] args) {
		StringBuffer sbf=new StringBuffer();
System.out.println(sbf.capacity());
sbf.append("Aspire ");
System.out.println(sbf);
System.out.println(sbf.capacity());
sbf.append("Training ");
sbf.append("center ");
sbf.append("Pune");
System.out.println(sbf);
System.out.println(sbf.capacity());
System.out.println(sbf.insert(3,"Pune"));
System.out.println(sbf.delete(11,19));

	}
	

}
