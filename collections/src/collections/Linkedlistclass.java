package collections;

import java.util.LinkedList;

public class Linkedlistclass {
	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add(10);
		ll.add(50);
		ll.add("kranthi");
		ll.add(null);
		ll.add("kranthi");
		ll.add(null);
		ll.add(32.1);
		ll.addFirst("kranthi"); /*Adding element at first Index*/
		ll.add(0, 9);          /* Adding element at Specified Index*/
		ll.addLast("kumar");    /*Adding element at last Index*/
		
		
		 
		System.out.println(ll); //prints all elements in array
		/*Iterator it=al.iterator();
		while(it.hasNext()) {System.out.println(it.next());}//Iterator used to print line by line.*/	
		
		System.out.println("ForIn loop");
		for(Object obj:ll) {System.out.println(obj);}
}
}