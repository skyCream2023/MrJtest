package apiexcercise;
import java.util.List;
import java.util.ArrayList;

public class ListTest {
	
	public static void listPropertest(){
		List<String>list = new ArrayList<>();
		list.add("J");
		list.add("A");
		list.add("V");
		list.add("A");
		
		System.out.println(list);
		list.add(1, "0");
		list.add(3,"0");
		
		System.out.println(list);
		
	}

	public static void main(String[] args) {
//		listPropertest();
		
		List<String> list = new ArrayList<>();
		list.add("Joe"); 
		list.add("Mary");
		list.add("Joe");
		System.out.println(list.contains("Mary"));
		System.out.println(list.get(0));
		System.out.println(list.indexOf(2));
		System.out.println(list.indexOf("Joe"));
		System.out.println(list.remove("Joe"));
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		list.set(0, "Paul");
		System.out.println(list);
	}

}
