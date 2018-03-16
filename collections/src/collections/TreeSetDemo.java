package collections;

import java.util.TreeSet;
public class TreeSetDemo {
	

	



		public static void main(String[] args) {
				TreeSet ts=new TreeSet();
				/*ts.add(1237);
				ts.add(1235);
				ts.add(1236);
				ts.add(1234);*/ //TreeSet takes only Homogenious data
				/*ts.add(null);*/ //it not accepts Null values
				ts.add("Kranthi");
				ts.add("Anudeep");
				ts.add("Raghavendra");
				ts.add("Sarath");
				System.out.println(ts);
				for(Object o:ts) {System.out.println(o);}
					}
		}
