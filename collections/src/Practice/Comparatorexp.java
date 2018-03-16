 package Practice;
import java.util.Comparator;

public class Comparatorexp implements Comparator {



	@Override
	public int compare(Object o1, Object o2) {
		Customer c1=(Customer) o1;
		Customer c2=(Customer) o2;
		
	     int idCompare=c1.getId().compareTo(c2.getId());/* This Logic can be applied by using ArrayList*/
	   
		if(c1.getAge().equals(c2.getAge())) {
			 int fnameCompare = c1.getFname().compareTo(c2.getFname());
			

		if(c1.getFname().equals(c2.getFname())) {
			 int lnameCompare = c1.getLname().compareTo(c2.getLname());
			 

				return lnameCompare;
		}
	return fnameCompare;
		
		
		
	
	}
		
return idCompare;

}}