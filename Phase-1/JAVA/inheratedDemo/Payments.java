package inheritanceDemo;

public class Payments extends HomePage {
	
	//this iclass is child to home and grandcgild to base class
	// multilevel inheritance
	
	
	public void payment() {
		System.out.println("test payment page");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Payments obj =new Payments();
		obj.openbrowser("chrome"); //base class
		login("admin","admin@123"); //base class
		obj.Homepagetest();//homeclass
		obj.payment();//current class
		obj.logout();//base class
	}

}
