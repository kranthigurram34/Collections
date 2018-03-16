 package Practice;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class TestCompare {

	public static void main(String[] args) {
     
		TreeSet ts=new TreeSet(new CustomComparator1());
		ts.add(new Customer(1035,25,"rajesh","Kathi"));
		ts.add(new Customer(1032,25, "Abhilash", "Suhan"));
		
		ts.add(new Customer(1034,25,"rajesh","suthi"));
		ts.add(new Customer(1031,25, "Abhilash", "hasan"));
		
		ts.add(new Customer(1033,26, "Mujeeb", "Md"));
		ts.add(new Customer(1029,26, "Mujeeb", "Mohammed"));
		ts.add(new Customer(1039,36, "Sirish", "Vadhwa"));
		
		ts.add(new Customer(1028,20, "Sonal", "Gadwe"));
		
		
		
	
		for(Object x:ts) {System.out.println(x);}
	}

}