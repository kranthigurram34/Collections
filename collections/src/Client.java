package Mappackageexp;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Client {

	public static void main(String[] args) {
		LinkedHashMap lm=new LinkedHashMap();
		lm.put(new MapClass1("kranthi","Gurram","gangadhar",22),new MapClass2("stigentech","Hyderabad",9948469094l,"male"));
		lm.put(new MapClass1("anudeep","Challa","mallikarjun",23),new MapClass2("stigentech","Hyderabad",970043567l,"male"));
		lm.put(new MapClass1("raghu","hari","vinayak",28),new MapClass2("wipro","Hyderabad",9887654321l,"male"));
/*System.out.println(lm);*/
Set s=lm.entrySet();
Iterator itr=s.iterator();
while(itr.hasNext()) {
	Entry e1=(Entry)itr.next();
	System.out.println(e1.getKey()+" "+e1.getValue());
}
}
	}
