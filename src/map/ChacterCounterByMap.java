package map;

import java.util.HashMap;
import java.util.Set;

public class ChacterCounterByMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str="aiigbdsigssdius";
        
        HashMap<Character, Integer> hs=new HashMap();
        
        for(int i=0;i<=str.length()-1;i++)
        {   char c=str.charAt(i);
        	if(hs.containsKey(c))
        	{
        		hs.put(c, hs.get(c)+1);
        	
        	}
        	else
        	{
        		hs.put(c,1);
        	}
        	
        	}
            
           Set<Character> allkeys= hs.keySet();
           for(Character key:allkeys)
           {
        	   System.out.println(key+":"+hs.get(key));
           }
        
        }
	}


