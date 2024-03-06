package pkg1;

import java.util.HashMap;
import java.util.Map;

public class HashTest {

	public static void main(String[] args) {
		
		Map<String, Integer> gfNrMap = new HashMap<>();
		gfNrMap.put("Ross", 12);
		gfNrMap.put("Chandler", 8);
		
		int rossNrOfGfs = gfNrMap.get("Ross");
		int rossNrOfGfs1 = gfNrMap.get("Chandler");
//		System.out.println(rossNrOfGfs);
//		System.out.println(rossNrOfGfs1);
		
		gfNrMap.put("Chandler", 9);
		int rossNrOfGfs2 = gfNrMap.get("Chandler");
		System.out.println(rossNrOfGfs);
		System.out.println(rossNrOfGfs2);
		
		for(Map.Entry<String, Integer> entry: gfNrMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		System.out.println();
		System.out.println();
		
		
		for(String key : gfNrMap.keySet()) {
			System.out.println(key + " : " + gfNrMap.get(key));
		}
		for(Integer value : gfNrMap.values()) {
			System.out.println(value);
		}
		
		
		
//		gfNrMap.remove("Ross");

	}

}
