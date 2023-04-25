package basic;
import java.util.*;
public class crete_hash {

	public static void main(String[] args) {
		HashSet<String>  names=new HashSet<String>(5);
		names.add("jagadeesh");
		names.add("siva");
		names.add("ramesh");
		names.add("rajesh");
		names.add("sunil");
		
		boolean k=names.contains("jagadeesh");
		if(k)
		{
			System.out.println(true);
		}
		
		if(names.contains("rajesh"))
		{
			System.out.println(true);
		}
		
		Iterator<String> it=names.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println(names.remove("rajesh"));
		
		names.clear();
		System.out.println(names.size());
		
		

	}

}
