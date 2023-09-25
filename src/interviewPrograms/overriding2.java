package interviewPrograms;

public class overriding2 extends overriding {
public void bike() {
	System.out.println("child bike");
	}
public void bycycle() {
	System.out.println("child bycycle");
}
public static void main(String args[]) {
	overriding2 or = new overriding2();
	or.bunglow();
	or.car();
}
}
