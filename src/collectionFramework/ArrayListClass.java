package collectionFramework;
import java.util.ArrayList;
public class ArrayListClass {

	public static void main(String[] args, String temp) {
	ArrayList<Comparable> al=new ArrayList();
	al.add("Pooja");
	al.add("Hule");
	al.add("A");
	al.add("9860421557");
	al.add("79.60");
	al.add("Pune");
	al.add(null);
	al.add(null);
	al.add(null);
	al.add(true);
	al.add("Pooja");
	al.add("Hule");
	al.add("A");
	System.out.println(al);
	al.remove(7);
	System.out.println(al);
	al.set(4,"Institute");
	System.out.println(al);
	boolean a = al.contains("Pune");
	System.out.println(al);
	System.out.println(al.get(4));
	System.out.println("Print all array elements with for loop");
for(int i =0;i<=al.size()-1;i++)
{
	System.out.println(al.get(i)+",");
}
System.out.println("Print all array elements with for each loop");
for(Object temp1:al);
{
	
	System.out.println(temp +",");
}
	}

}

