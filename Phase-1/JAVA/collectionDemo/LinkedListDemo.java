package collectionDemo;

import java.util.Iterator;

import java.util.LinkedList;


public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			LinkedList<String> cities =new LinkedList<>();
			
			cities.add("london");
			cities.add("paris");
			cities.add(2,"london");//add values
			cities.add("mumbai");
			
			
			
			System.out.println(cities.size()); //print no of element in list 
			
			/*for(String t: cities)
			{
				System.out.println(t);
			}
			*/
			Iterator itr= cities.iterator();

				while(itr.hasNext())
				{
					System.out.println(itr.next());
					
				}

				System.out.println(cities.get(1));
				
				System.out.println(cities.contains("pune"));
				

	
	}

}
