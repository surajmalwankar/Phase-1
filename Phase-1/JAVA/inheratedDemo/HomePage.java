package inheritanceDemo;

public class HomePage extends Base {
	
	public void Homepagetest ()
	{
		System.out.println("Test for Home Page");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// creat object of child 
		HomePage obj =new HomePage();
		
		obj.openbrowser("Chrome");
		login("admin", "admin");
		obj.Homepagetest();
		//obj.logout();	
		
	}

}
