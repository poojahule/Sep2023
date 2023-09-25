package logicalprograms;
//weekly days by number or char,string
//1-sunday
//2-monday
public class switch2 {

	public static void main(String[] args) {
	int days=7;
	switch (days) {
	case 1:
		System.out.println("sunday");
		break;
	case 2:
		System.out.println("monday");
			break;
	case 3:
		System.out.println("tuesday");
		break;
	case 4:
		System.out.println("wedensday");
		break;
	case 5:
		System.out.println("thursday");
		break;
	case 6:
		System.out.println("friday");
		break;
	case 7:
		System.out.println("saturday");
		break;
		default:
			System.out.println("no data");
			break;
	}

	}

}
