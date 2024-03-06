package pkg1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

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

			public static void main(String[] args) {

				List<Person> personList = new ArrayList<>();
				personList.add(new Person("Huud",1));
				personList.add(new Person("Joep",4));
				personList.add(new Person("Anne",3));
				Collections.sort(personList);
				

				Comparator<Person> nameComparator = (p1, p2) ->
				p1.getName().compareTo(p2.getName());
				TreeMap<Person,Integer> personTreeMapByName = new TreeMap<>(nameComparator);
				personTreeMapByName.put(new Person("huub",1),1);
				personTreeMapByName.put(new Person("Joep",4),4);
				personTreeMapByName.put(new Person("Anne",3),3);
				
				Collections.sort(personList);
				System.out.println("이름순으로 정렬된 배열");
				for(Person person : personList) {
					System.out.println(person);
					}
				}
			}