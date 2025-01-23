package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class Arraylist {

	public static void main(String[] args) {
     
		ArrayList al=new ArrayList();
		
		al.add(20);
		al.add(true);
		al.add(75.55);
		al.add("Aman");
		
		System.out.println(al);
		
		Object[]ob=al.toArray();
		System.out.println(Arrays.toString(ob));
		
		for(int i=0;i<al.size();i++)
		{
			System.out.print(al.get(i)+" ");
		}
		
		System.out.println();
		
		for(Object o:al)
		{
			System.out.print(o+" ");
		}
		
		System.out.println(al.get(3));
		
		System.out.println(al.contains(true));
		al.addLast(90);
		
		System.out.println(al);
		
		System.out.println(al.isEmpty());
		
		Iterator<Object> i=al.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		ListIterator<Object> li=al.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		
	   while(li.hasPrevious())
	   {
		   System.out.println(li.previous());
	   }
	}

}
