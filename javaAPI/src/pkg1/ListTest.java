package pkg1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Person1{
	String name;
	int workYear;
	
	Person1(String name, int workYear){
		this.name = name;
		this.workYear = workYear;
		}
	}

public class ListTest {

	public static void main(String[] args) {
		List<String> studentNames = new ArrayList<>();
		studentNames.add("Sarag-Milou");
		studentNames.add("Tjedc");
		studentNames.add("Fahys");
		
		for(String student : studentNames) {
			System.out.println(student);
		}
		List<Person> personNames = new ArrayList<>();
		personNames.add(new Person("Sarah-Miloi", 4));
		personNames.add(new Person("Tjed", 6));
		personNames.add(new Person("Fahya", 8));
		
		for(Person Person : personNames) {
			System.out.println(Person);
		}
		Set<String> eamilAddresses = new HashSet<>();
		eamilAddresses.add("sarahmilou@amsterdam.com");
		eamilAddresses.add("tjed@amsterdam.com");
		eamilAddresses.add("fahy@amsterdam.com");
		eamilAddresses.add("fahy@amsterdam.com");
		
		for(String email : eamilAddresses) {
			System.out.println(email);
			}
		}
	}

