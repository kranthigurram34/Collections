package comparator;

import java.util.Comparator;

public class ComparatorDemo implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Employee em1=(Employee)o1;
		Employee em2=(Employee)o2;
		if(em1.getName().equals(em2.getName())) {
		int ageCompare=em1.getAge().compareTo(em2.getAge());
		
		return ageCompare;
		}
 int nameCompare=em1.getName().compareTo(em2.getName());
		
		return nameCompare;
	}
	

}
