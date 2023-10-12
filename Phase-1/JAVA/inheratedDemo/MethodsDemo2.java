package inheritanceDemo;

public class MethodsDemo2 {
	
	int x = 100;
	String str3 = "Java";
	
	public int sum()
	
	{
		
		int a =10;
		int b=20;
		int result = a+b+x;
		return result;

	}
	
	public String concatmethod()
	
	{
	
	String str1 = "selenium";
	
	String str2 = "setraining";

	String result = str1+str2+str3;
	return result;
	}
	
	public void printmethod()
	{
		System.out.println("global integer" + x);
		
		System.out.println("global integer" + str3);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
		MethodsDemo2 obj =new MethodsDemo2();
		
		System.out.print(obj.concatmethod());
		int value =obj.sum();
		
		System.out.println(value);
		
		obj.printmethod();
		
	
	}

}
