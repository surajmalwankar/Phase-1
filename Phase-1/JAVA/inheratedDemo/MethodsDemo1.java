package inheritanceDemo;

public class MethodsDemo1 {
	//method written here 
	// method which don't return a value.
	public void login()
	{
		System.out.println("enter user name");
		System.out.println("enter password");
		System.out.println("enter sign into mailbox");
	}
	
    public void ComposeEmail()
    {
    	System.out.println("compose an email");
    }

    public void logout()
    {
    	System.out.println("click on logout button");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//create java class object
		//give name to object
		
		MethodsDemo1 obj =new MethodsDemo1();
		
		//call the method created in the class
		
		//objname.methodname();
		
		obj.login();
		
		obj.ComposeEmail();
		
		obj.login();
	
	}

}
