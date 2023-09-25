package conditionalstatement1;

public class nestedif {

	public static void main(String[] args) {
		String username="abc";
		String password="abc@123";
		if(username=="abc")
		{
			System.out.println("username is correct");
	if(password=="abc@123")
	{	
		System.out.println("username is correct");
		System.out.println("login successfully");
	}
	else
	{
		System.out.println("password is wrong");
	}
		}
	else
	{
		System.out.println("username is wrong");
	}
   }
}
