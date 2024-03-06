package pkg1;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class MaTest {

	public static void main(String[] args) {
		Map<String, String> userInfo = new HashMap<>();
		userInfo.put("Sarah-milou", "Sarah-Miloi Doyle");
		userInfo.put("Tjed","Tjed Quist");
		userInfo.put("Fahys", "Fahys Osei");
		
		Queue<String> printQueue = new LinkedList<>();
		printQueue.add("doqument1");
		printQueue.add("document2");
		printQueue.add("document3");
		
		String nextJob = printQueue.poll();
		
		System.out.println(nextJob);
		
		List<String> names = new ArrayList<>();
		names.add("Julie");
		names.add(0,"Janice");
		String name = names.get(1);
		System.out.println(name);
		names.set(1, "Monica");
		String name1 = names.get(1);
		System.out.println(name1);
//		names.remove(1);
//		names.remove("Janice");
//		System.out.println(names.get(0));
		
		for(int i =0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		for(String name2 : names) {
			System.out.println(name2 + " ");
		}
		System.out.println();
		
		Set<String> names3 = new HashSet<>();
		names3.add("Elizaveth");
		names3.add("Janie");
			for(String name4 : names) {
				System.out.println("1 =>HashSet : " + name4);
			}
			for(String name4 : names3) {
				System.out.println("2 =>HashsSet" + name4);
			}
	}
	

}
