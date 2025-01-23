package map;

import java.util.HashMap;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Character> hs=new HashMap<>();
		hs.put(1,'a');
		hs.put(2, 'b');
		hs.put(3, 'c');
		hs.put(4, 'd');
		hs.put(5, null);
		
		System.out.println(hs);
		
	    Set<Integer>allKeys=hs.keySet();
	    for(Integer key:allKeys) {
	    	System.out.println(key+":"+hs.get(key));
	    	
	    }
	    
		
		
		
		
		
		
		
		

	}

}
