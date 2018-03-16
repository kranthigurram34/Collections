	package collections;

	import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;

public class Cursorsdemo {

	 
	public static void main(String args[]) {
		ArrayList al=new ArrayList();
					
					al.add("Kranthi");
					al.add("Anudeep");
					al.add("Raghavendra");
					al.add("Sarath");
					
					System.out.println("<<<<<Normal iteration>>>>>");
					System.out.println(al);
					
					
					System.out.println("<<<<For Loop>>>>");
					for(int i=0;i<al.size();i++) {System.out.println(al.get(i));}
					
					System.out.println("<<<<<For In Loop>>>>>");
					for(Object o:al) {System.out.println(o);}
					
					System.out.println("Iterator class");
					Iterator itr=al.iterator();
					while(itr.hasNext()) {System.out.println(itr.next());}
					
					System.out.println("<<<<Enumeration Legacy Class>>>>");
					Enumeration en=Collections.enumeration(al);
					while(en.hasMoreElements()) {System.out.println(en.nextElement());}
					
					System.out.println("<<<< List Iterator>>>>");
					ListIterator ltr=al.listIterator();
					while(ltr.hasNext()) {System.out.println(ltr.next());}
					
					System.out.println("<<< List Iterator To print from back >>>");
					
					
					while(ltr.hasPrevious()){
	{System.out.println(ltr.previous());}
				
					
					}
			
					}
					
						
	}



