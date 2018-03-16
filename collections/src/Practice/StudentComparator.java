package Practice;

import java.util.Comparator;

public class StudentComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Student s1=(Student)o1;
		Student s2=(Student)o2;
		int idCompare=s1.getId().compareTo(s2.getId());
		int ageCompare=s1.getAge().compareTo(s2.getAge());
		int nameCompare=s1.getName().compareTo(s2.getName());
		
		
		if(idCompare<0) {
			if(ageCompare==0) {
				
				if(nameCompare==0)	{
				
					return -1;
				}
				else if(nameCompare<0) {
					return -1;
				}
					return 1;
			}
			else if(ageCompare<0) {
				return -1;
			}
			return 1;
		}
			
		
	
	
	
		else if(idCompare>0) {
			if(ageCompare==0) {
				
			if(nameCompare==0)	{
				
				return 1;
				}
			else if(nameCompare<0) {
				return -1;
			}
			return 1;
			}
			
			
			else if(ageCompare<0) {
				return -1;
			}
			return 1;
			}
			
			
	

	else{
		return -1;}
}}
	

		
/*		if(ageCompare==0) {
			return idCompare;
			}
		
		if(idCompare==0) {
			return nameCompare;
		}
         return idCompare;*/


