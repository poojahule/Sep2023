package conditionalstatement1;
//month by number
//1-jan
//2-feb
//3-march
public class switch1 {

	public static void main(String[] args) {
		int month=24;         //we can also use char,string here
		switch(month) {
		case 1:
			System.out.println("jan");
		break;
		case 2:
			System.out.println("feb");
		break;
		case 3:
			System.out.println("march");
		break;
		case 4:
			System.out.println("april");
		break;
		case 5:
			System.out.println("may");
		break;
		case 6:
			System.out.println("june");
		break;
		case 7:
			System.out.println("july");
		break;
		case 8:
			System.out.println("aug");
		break;
		case 9:
			System.out.println("sept");
		break;
		case 10:
			System.out.println("oct");
		break;
		case 11:
			System.out.println("nov");
		break;
		case 12:
			System.out.println("dec");
		break;
		default:
			System.out.println("not defined");
		break;

		
		
		}
		

	}

}
