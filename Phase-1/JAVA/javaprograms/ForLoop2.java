package javaprograms;

public class ForLoop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//write a for loop to print characters of strings
		//string no start with 0-(n-1)
		//syntax to call method already defined in class is
		// objectname.methodname()
		
		
		String s1 ="Learning Java";
		
		//print length of string 
		
		int len = s1.length();
		
		for(int i=0;i<len;i++)
		{
			//System.out.println(i);// this will just print the index of character in string
			System.out.print(s1.charAt(i));
		}
		
		
	}
}
