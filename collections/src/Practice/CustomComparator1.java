 package Practice;

import java.util.Comparator;

public class CustomComparator1 implements Comparator<Customer> {

	@Override
	public int compare(Customer c1, Customer c2) {
		
		int idCompare = c1.getId().compareTo(c2.getId());
		int ageCompare = c1.getAge().compareTo(c2.getAge());
		int firstCompare = c1.getFname().compareTo(c2.getFname());
		int lastCompare = c1.getLname().compareTo(c2.getLname());
		
		if(idCompare<0) {             /*This logic is mainly used for TreeSet*/
			
			if(ageCompare==0) {
				
				if(firstCompare==0) {
					
					if(lastCompare==0) {
						
						return -1;
					}else if(lastCompare<0) {
						return -1;
					}else if(lastCompare>0) {
						return 1;
					}
					
					return -1;
				}else if(firstCompare<0) {
					
					return -1;
				}else if(firstCompare>0){
					return 1;
				}
				
				return -1;
			}
			
			return -1;
			
			/*---------------------------------------------------------------------------------*/
			
			
		}else if(idCompare>0) {
			
			if(ageCompare==0) {
				
				if(firstCompare==0) {
					
					if(lastCompare==0) {
						
						return 1;
					}else if(lastCompare<0) {
						return -1;
					}else if(lastCompare>0) {
						return 1;
					}
					
					return 1;
				}else if(firstCompare<0) {
					
					return -1;
				}else if(firstCompare>0) {
					return 1;
				}
				
				return 1;
			}
			
			return 1;
		}
		
		/*-----------------------------------------------------------------------*/
		
		else {
			
			return -1;
		}
		
	}

}
