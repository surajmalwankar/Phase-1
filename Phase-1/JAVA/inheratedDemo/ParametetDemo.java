package inheritanceDemo;

public class ParametetDemo {
	
	//pass values to methos -->parameters
		//method written here 
		// method which don't return a value.
		public void login(String username,String password)
		{
			System.out.println("enter user name" + username);
			System.out.println("enter password" + password);
			System.out.println("enter sign into mailbox");
		}
		
	    public void ComposeEmail(String text)
	    {
	    	System.out.println("compose an email with text as :" + text);
	    }

	    public void logout()
	    {
	    	System.out.println("click on logout button");
	    }

		public static void main(String[] args) {
			// TODO Auto-generated method stub

		//create java class object
			//give name to object
			
			ParametetDemo obj =new ParametetDemo ();
			
			//call the method created in the class
			
			//objname.methodname();
			
			obj.login("suraj","admin@123");
			
			obj.ComposeEmail("Hello all");
			
			obj.login("admin","admin");
			obj.logout();
		
		}


	//public static void main(String[] args) {
		// TODO Auto-generated method stub


}
