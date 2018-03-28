package SortedSet;

import java.util.TreeSet;

public class TreesetMethods {

	public static void main(String[] args) {
	TreeSet ts=new TreeSet();
	ts.add(1);
	ts.add(3);
	ts.add(5);
	ts.add(7);
	ts.add(9);
	System.out.println(ts);
	System.out.println("-------Sorted Set methods--------");
	System.out.println();
	
	
	
	System.out.println(ts.first());
	System.out.println(ts.last());
	System.out.println(ts.headSet(7));
	System.out.println(ts.subSet(3,9));
	System.out.println(ts.tailSet(5));
	
	
	System.out.println();
	System.out.println("---------Navigable Set methods :----------");
	System.out.println();
	
	
	System.out.println(ts.ceiling(6));
	System.out.println(ts.floor(6));
	System.out.println(ts.headSet(7));
	System.out.println(ts.pollFirst());
	System.out.println(ts.pollLast());
	System.out.println(ts.higher(3));
	System.out.println(ts);
	System.out.println(ts.lower(3));
	System.out.println(ts.headSet(7, false));
	System.out.println(ts.headSet(7, true));
	System.out.println(ts.tailSet(5,true));
	}
	

}