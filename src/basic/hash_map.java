package basic;
import  java.util.*;
public class hash_map {

	public static void main(String[] args) {
		HashMap <Integer,String>  hash=new HashMap(10);
		
		hash.put(0, "jagadeesh");
		hash.put(1, "john");
		hash.put(2, "praveen");
		hash.put(3, "prakash");
		hash.put(4, "siva");
		hash.put(5, "madhu");
		System.out.println(hash);
		
		//Insert a Key value mapping into the map
		hash.put(7,"ramesh");
		System.out.println(hash);
		
		//Fetch the value of a Key
		 System.out.println(hash.get(7));
		 
		 //Create a clone/copy of HashMap
		 HashMap <Integer,String> copymap=(HashMap<Integer,String>) hash.clone();
		 
		 System.out.println(copymap);
		 //Check if the given Key is in the Map
		 int check=2;
		 if (hash.containsKey(check))
		 {
			 System.out.println(true);
		 }
		 else
		 {
			 System.out.println(false);
		 }
		 
		 //Check if the value is in the Map
		 String checks="jagadeesh";
		 if (hash.containsValue(checks))
		 {
			 System.out.println(true);
		 }
		 else
		 {
			 System.out.println(false);
		 }

		 //Check if the map is empty
		 if (hash.isEmpty())
		 {
			 System.out.println(true);
		 }
		 else
		 {
			 System.out.println(false);
		 }
		 
		 System.out.println(hash.size());
		 
		 Set<Integer> keys=hash.keySet();
		 for(Integer k:keys)
		 {
			 System.out.println("those keys are"+k);
		 }
		 
		// Remove a specific Key-value pair
		 
		 Integer k=2;
		 String n="praveen";
		 if(hash.containsKey(k)&&hash.get(k).equals(n))
		 {
			 hash.remove(k);
			 System.out.println(hash);
		 }
		 
		 HashMap <Integer,String> hash2=new HashMap<Integer,String>();
		 
		 hash2.putAll(hash);
		 System.out.println(hash2);


		
		

	}

}
