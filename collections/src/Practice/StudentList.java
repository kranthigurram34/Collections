package Practice;

import java.util.ArrayList;
import java.util.Collections;

public class StudentList {

	public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add(new Student(534,"kranthi",22));
	al.add(new Student(512,"Bhanu",21));
	al.add(new Student(534,"ganesh",22));
	al.add(new Student(508,"Venkatesh",21));
	al.add(new Student(534,"Suresh",28));
	al.add(new Student(508,"Mahesh",28));
	Collections.sort(al,new StudentComparator());
	
	for(Object o:al) {System.out.println(o);}

	}

}