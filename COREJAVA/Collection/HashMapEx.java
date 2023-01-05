package in.co.Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
	public static void main(String[] args) {

		HashMap map = new HashMap();
		map.put("1", null);
		map.put(null, "two");
		map.put("3", "three");
		map.put("4", "four");
		map.put("5", 4.9);
		map.put(6, "true");

		 System.out.println(map);

		String str = (String) map.get("3");
		System.out.println(str);

		Set keys = map.keySet();
		for (Object k : keys) {
			System.out.println(keys);
		}

		Collection c = map.values();
		for(Object v : c) {
			System.out.println(c);
		}
		Set Keyvalue = map.entrySet();
		for(Object ele : Keyvalue) {
			Map.Entry pair = (Map.Entry)ele;
			System.out.println(pair.getKey() + " " + pair.getKey());
		}
		
		
		/*
		 * Object values = map.get(3); System.out.println(values);
		 */
	}

}
