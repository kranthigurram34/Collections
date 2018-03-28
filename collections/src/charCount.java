package Mappackageexp;
import java.util.ArrayList; 
import java.util.Arrays; 
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set; 
public class charCount { 
	public static void main(String[] args) {
		
	 
		String s="kranthi kumar"; 
		char[] ch;
		ArrayList al=new ArrayList<>(Arrays.asList(s)); 
		
		HashMap hs=new HashMap();
		
		
		for (int i = 0; i < s.length(); i++) { 
			char c = s.charAt(i); 
			
			if (hs.containsKey(c)) { 
				int cnt = (int) hs.get(c);
				hs.put(c, ++cnt); 
	
				
		} 
			else { 
			
			hs.put(c, 1);
			} 
			} 
		System.out.println(hs); 
		
		
		/*Set e=hs.entrySet();
		Iterator itr=e.iterator();
		while(itr.hasNext()){
			Entry e1=(Entry)itr.next();
			System.out.println(e1.getValue()+" "+e1.getKey()); }*/
		}
				
		
	}
