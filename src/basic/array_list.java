package basic;
import java.util.*;
public class array_list {

	public static void main(String[] args) {
		ArrayList<String> myarr=new ArrayList<String>(10);
		
		myarr.add("apple"); 
		myarr.add("banana"); 
		myarr.add("kiwi"); 
		
	//	System.out.println(myarr);
		//iterator iteams
		Iterator<String> it=myarr.iterator();
		
		while(it.hasNext())
		{
			String ele=it.next();
			System.out.println(ele);
		}
		// Add an element "fig" at index 2 in the ArrayList
		myarr.add(2,"jala");
		System.out.println(myarr);
		
		//Remove an element from the ArrayList, Remove at an index
		myarr.remove("apple");
		myarr.remove(2);
		System.out.println(myarr);
		//Update the element at a specific index
		myarr.add(1,"academy");
		System.out.println(myarr);
		
		//Check the element is present at a particular index
		boolean ispresent=myarr.size()>2&&myarr.get(2).equals("jala");
		if(ispresent)
		{
			System.out.println("elemet is present");
		}

		//get element in particular index
		System.out.println("the particular index element is "+myarr.get(2));
		//Find out the size of the ArrayList
		System.out.println(myarr.size());
		//Check the given element is present in the ArrayList
		boolean present=myarr.contains("apple");
		if(present)
		{
			System.out.println(true);
		}
		//Remove all elements of the ArrayList
		myarr.clear();
		System.out.println("After removing all elements in array "+myarr.size());

		
	}

}
