package holding;

import java.util.Arrays;
import java.util.*;



import net.mindview.util.Countries;

/*
 * Fill a HashMap with key-value pairs.Print the results
 * to show ordering by hash code. Extract the pairs, sort
 * by key, and place the result into a LinkedHashMap.
 * Show that insertion order is maintained.
 */
public class E_18_MapOrder {
	
	public static void main(String[] args){
		
		Map<String,String> m1=
				new HashMap<String,String>(Countries.capitals(25));
		System.out.println(m1);
		String[] keys = m1.keySet().toArray(new String[0]);
		Arrays.sort(keys);
		Map<String,String>m2 = 
				new LinkedHashMap<String,String>();
		for(String key:keys)
			m2.put(key, m1.get(key));
		System.out.println(m2);
		
	}
}
