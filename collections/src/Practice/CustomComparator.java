 package Practice;

import java.util.Comparator;

public class CustomComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer c1, Customer c2) {   
		
		int idCompare = c1.getId().compareTo(c2.getId());
		int ageCompare = c1.getAge().compareTo(c2.getAge());
		int firstCompare = c1.getFname().compareTo(c2.getFname());
		int lastCompare = c1.getLname().compareTo(c2.getLname());
		if(ageCompare==0) {/* This Logic can be applied by using ArrayList*/
			return firstCompare;
		}
		if(firstCompare==0) {
			return lastCompare;
		}
		
		
		return idCompare;
		
		
		
	}

}
