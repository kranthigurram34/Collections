package comparator;

import java.util.TreeSet;

public class EmployeeList {
	public static void main(String args[]) {
TreeSet ll=new TreeSet(new ComparatorDemo());
ll.add(new Employee(534,"kranthi",24,"Hyderabad"));
ll.add(new Employee(53,"kranthi",22,"siddipet"));
ll.add(new Employee(34,"anudeep",24,"krmn"));
ll.add(new Employee(54,"anudeep",21,"kmm"));
ll.add(new Employee(134,"raghavendra",56,"bihar"));
ll.add(new Employee(65,"sarath",88,"andaman"));
	System.out.println(ll);
	}
}