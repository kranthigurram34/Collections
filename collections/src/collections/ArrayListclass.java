package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListclass {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(50);
		al.add("kranthi");
		al.add(null);
		al.add("kranthi");
		al.add(null);
		al.add(32.1);
		
		System.out.println(al); //prints all elements in array
		/*Iterator it=al.iterator();
		while(it.hasNext()) {System.out.println(it.next());}//Iterator used to print line by line.*/	
		
		System.out.println("ForIn loop");
		for(Object obj:al) {System.out.println(obj);}
		
		
		System.out.println("For Loop");
		for(int i=0;i<al.size();i++) {System.out.println(al.get(i));}
	}
	
	

}
