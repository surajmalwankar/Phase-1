package javaprograms;

public class InbultDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String title ="Simplilearn online course";
	
	//contains() method
	
	
	//title page ==>valodate if title is correct or not
	//if title is correct print test case pass else fail
	
	
	//Method 1: using constains() method;
	
	if(title.contains("Simplilearn online course")) {
		System.out.println("Title is valid test case pass");
	}
	else{
		System.out.println("Title is not valid test case fail");
	}
	
	//method2: eguals()
	// this method will compare 2 strings charscter
	//it give true or false
	
	if(title.equals("simplilearn online course")) {
		System.out.println("Title is valid test case pass");
	}
	else{
		System.out.println("Title is not valid test case fail");
	}
	
	
	//method 3: substring ()
	
	String title2 ="Practice lab java";

	//from string title2 extract only java
	//store it in a new string result
	
	//write conditition. if result equals java - test case pass
	//else test case fail
	
	
	
	String result = title2.substring(14);
	//write conditiion if result java test pass
	
	if(result.equals("java"))
	{
		System.out.println("string is valid test case pass");
	}
	else{
		//else case fail
		System.out.println("string is not valid test case fail");
	}
	
	}

}
