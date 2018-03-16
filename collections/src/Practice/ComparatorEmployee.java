package Practice;
import java.util.Comparator;

public class ComparatorEmployee implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Employee e1=(Employee)o1;
		Employee e2=(Employee)o2;
		int fnameCompare=e1.getFirstname().compareTo(e2.getFirstname());
		int lnameCompare=e1.getLastname().compareTo(e2.getLastname());
		int mobileCompare=e1.getMobileno().compareTo(e2.getMobileno());
		int ageCompare=e1.getAge().compareTo(e2.getAge());
		int accountCompare=e1.getAccnttype().compareTo(e2.getAccnttype());
		
		
		if(fnameCompare==0) {
			if(lnameCompare==0) {
				if(mobileCompare==0) {
					if(ageCompare==0) {
						if(accountCompare>0) {
							return 1;
						}
						return -1;
					}else if(ageCompare<0) {
						return -1;
					}
					return 1;
					
				}else if(mobileCompare<0) {
					return -1;
				}
				return 1;
				
			}else if(lnameCompare<0) {
				return -1;
			}
			return 1;
		}
		else if(fnameCompare>0) {
			return 1;
		}
		
		return -1;
	}






}