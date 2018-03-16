package collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
public class LinkedHashSetClass {
	public static void main(String[] args) {
		HashSet lhs=new HashSet();
		lhs.add(10);
		lhs.add(50);
		lhs.add("kranthi");
		lhs.add(null);
	
		lhs.add("kranthi");
		lhs.add(null);
		lhs.add(32.1);
		
		 
		System.out.println(lhs); //prints all elements in array
		/*Iterator it=al.iterator();
		while(it.hasNext()) {System.out.println(it.next());}//Iterator used to print line by line.*/	
		
		System.out.println("ForIn loop");
		for(Object obj:lhs) {System.out.println(obj);}
}
}

