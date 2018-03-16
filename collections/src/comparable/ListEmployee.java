package comparable;

import java.util.TreeSet;

	public class ListEmployee {
		public static void main(String args[]) {
	TreeSet ll=new TreeSet();
	ll.add(new Employee1(534,"kranthi",24000,"Hyderabad"));
	ll.add(new Employee1(53,"kranthi",21000,"siddipet"));
	ll.add(new Employee1(34,"anudeep",22000,"karimnagar"));
	ll.add(new Employee1(54,"anudeep",18000,"khammam"));
	ll.add(new Employee1(134,"raghavendra",56000,"bihar"));
	ll.add(new Employee1(65,"sarath",88000,"andaman"));
		
	for(Object o:ll)
	System.out.println(o);
		
		
		
		}
	}
