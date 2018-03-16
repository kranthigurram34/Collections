package Practice;

import java.util.TreeSet;

public class EmployeeList {

	public static void main(String[] args) {
		TreeSet ts=new TreeSet(new ComparatorEmployee());
		ts.add(new Employee("kranthi","Gurram",9948469094l,22,"Savings"));
		ts.add(new Employee("anudeep","Challa",970044826l,23,"Savings"));
		ts.add(new Employee("raghavendra","Tirunagari",8790596864l,24,"Current"));
		ts.add(new Employee("sarath","Babu",8978637637l,28,"Savings"));
		ts.add(new Employee("pavan","Gurram",9666447986l,21,"Current"));
		ts.add(new Employee("kranthi","Aurram",9948469094l,22,"Savings"));
		ts.add(new Employee("pavan","Gurram",8666447986l,21,"Current"));
		ts.add(new Employee("kranthi","Gurram",8948469094l,22,"Savings"));
		ts.add(new Employee("kranthi","Gurram",9948469094l,21,"Savings"));
		ts.add(new Employee("kranthi","Gurram",9948469094l,21,"Current"));
		/*for(Object o:ts) {
			System.out.println(o);
		
		}
*/		
System.out.println(ts.first());
System.out.println(ts.last());
System.out.println(ts.headSet(28));
	}

}