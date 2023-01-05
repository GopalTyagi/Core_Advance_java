package in.co.Collection;

import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {

		TreeMap map = new TreeMap();
		map.put(101, "ram");
		map.put(102, "shyam");
		map.put(103, "lakhan");
		map.put(104, "bharat");
		// map.put(null, "five"); //it doesn't take null values

		for (Object o : map.keySet()) {
			System.out.println(o + "=" + map.get(o));
				
		}

	}

}
