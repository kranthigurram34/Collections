package collections;

import java.util.HashSet;

public class Hashsetclass {
	

	

	
		public static void main(String[] args) {
			HashSet hs=new HashSet();
			hs.add(10);
			hs.add(50);
			hs.add("kranthi");
			hs.add(null);
			hs.add("kranthi");
			hs.add(null);
			hs.add(32.1);
			hs.add(89.1);
			 
			System.out.println(hs); //prints all elements in array
			/*Iterator it=al.iterator();
			while(it.hasNext()) {System.out.println(it.next());}//Iterator used to print line by line.*/	
			
			System.out.println("ForIn loop");
			for(Object obj:hs) {System.out.println(obj);}
	}
	}
