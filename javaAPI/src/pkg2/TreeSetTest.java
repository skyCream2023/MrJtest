package pkg2;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

class Person implements Comparable<Person>{
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
		}
	public String getName() {
		return name;
	}
	@Override
	public int compareTo(Person other) {
		return Integer.compare(this.age, other.age);
	}
	@Override	
	public String toString() {
		return "name: " + this.name + "age: " + this.age;
	}
	}

public class TreeSetTest {

	public static void main(String[] args) {
		Comparator<Person> nameComparateor = 
				(p1,p2) -> p1.getName().compareTo(p2.getName());
				TreeSet<Person> personTreeSetByName = new TreeSet<>(nameComparateor);
				personTreeSetByName.add(new Person("Huud", 1));
				personTreeSetByName.add(new Person("Joep", 4));
				personTreeSetByName.add(new Person("Anne", 3));
				
				System.out.println(personTreeSetByName);
	}
	}

