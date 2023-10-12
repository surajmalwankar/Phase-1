package javaprograms;

public class ConstructorDemo {
	
	public ConstructorDemo()
	{
	System.out.println("This is default constructor");
	}
	public ConstructorDemo(int a)
	 {
		// TODO Auto-generated method stub

		System.out.println("This is Parametrized constructor");
		System.out.println("The value of variable is"+ a);
	}
	public ConstructorDemo(int a, int b)
	{
		System.out.println("This is Parametrized constructor");
		System.out.println("The value of variable is"+ a);
		System.out.println("The value of variable is"+ b);
	}
		
		public static void main(String[] args){
			
			ConstructorDemo obj = new ConstructorDemo();
			ConstructorDemo obj2 = new ConstructorDemo(10); // prameterized constructor with 1 value
			ConstructorDemo obj3 = new ConstructorDemo(10,20); 
		}

}
