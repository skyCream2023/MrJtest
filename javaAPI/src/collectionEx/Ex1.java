package collectionEx;

import java.util.ArrayList;
import java.util.List;

public class Ex1 {
	private String name;
	private int age;
	private List<String>dino1;
	
//	public Ex1(String name, int age, List<String> dino) {
//		this.name = name;
//		this.age = age;
//		this.dino= new ArrayList<String>(dino);
//	}
	
	public String getName() {
		return this.name;
	}
	public Ex1(String name, int age, List<String> dino) {
	super();
	this.name = name;
	this.age = age;
	this.dino1 = dino;
}
	public int getAge() {
		return this.age;
	}
//	public int getDino() {
//		return this.ArrayList<String>(dino);
	
	
	

	
	public List<String> getDino() {
		return dino1;
	}
	public void setDino(List<String> dino) {
		this.dino1 = dino;
	}
	
	public static void main(String[] args) {
		
		List<String> dino = new ArrayList<>();
		dino.add("티라노");
		dino.add("케토톱");
		
		Ex1 ex1 = new Ex1("John", 25, dino);
		
		 System.out.println("Name: " + ex1.getName());
	        System.out.println("Age: " + ex1.getAge());
	        System.out.println("Dinosaurs: " + ex1.getDino());
	}
}

