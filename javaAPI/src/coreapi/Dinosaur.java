package coreapi;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Dinosaur {
	private String name;
	private String speciles;
	private String healthStatus;
	private String[][] newDino;
	Scanner sc = new Scanner(System.in);
	public Dinosaur(String name, String speciles, String healthStatus) {
		this.name = name;
		this.speciles = speciles;
		this.healthStatus = healthStatus;
		this.newDino = new String[0][];
		
	}
	public String getName() {
		return this.name;
	}
	public String setName(String name) {
		return this.name = name;
	}
	
	public String getSpeciles() {
		return this.speciles;
	}
	public String setSpeciles(String speciles) {
		return this.speciles = speciles;
	}
	
	public String getHealthStatus() {
		return this.healthStatus;
	}
	public String setHealthStatus(String i) {
		return this.healthStatus = i;
	}
	
	public String[][] getNewDino(){
		String[][] copyList = new String[newDino.length][];
		for(int i =0; i < copyList.length;i++) {
			copyList[i] = Arrays.copyOf(newDino[i],newDino[i].length);
		}
		return copyList;
	}
	
	public void NewDino() {
		this.newDino = new String[0][];
	}
	public void addDinosaur() {
		String ansRe = "미정";
	
		do {
		System.out.println("공룡의 이름을 입력해주세요.");
		this.setName(sc.next());
		System.out.println("공룡의 종을 입력해주세요");
		this.setSpeciles(sc.next());
		System.out.println("공룡의 건강 등급을 입력해주세요");
		this.setHealthStatus(sc.next());
		
		newDino = Arrays.copyOf(newDino,newDino.length+1);
		String[] newArr = new String[] {getName(), getSpeciles(), getHealthStatus()};
		newDino[newDino.length -1] = newArr;
		System.out.println(Arrays.deepToString(getNewDino()));
		System.out.println("공룡을 추가로 저장하시겠습니까?  ex)네/아니오");
		ansRe = sc.next();	
	}while(ansRe.equals("네"));
	}
}

class Activity{
	private String name;
	private LocalDate date;
	private int dinoNum;
	public Activity(String name, LocalDate date, int dinoNum) {
		this.name = name;
		this.date = date;
		this.dinoNum = dinoNum;
	}
	public String getName() {
		return this.name;
	}
	public LocalDate getDate() {
		return this.date;
	}
	public int getDinoNum() {
		return this.dinoNum;
	}
	
}

class DinosaurCareSystem{
	Dinosaur[] dino = new Dinosaur[5];
	Activity[] aty = new Activity[5];
	
	public DinosaurCareSystem() {
		dino[0] = new Dinosaur("rano", "t-rex", "4");
		dino[1] = new Dinosaur("kera", "joojack", "3");
		dino[2] = new Dinosaur("tops", "huynmoo", "3");
		dino[3] = new Dinosaur("ragoon", "Dragon", "3");
		dino[4] = new Dinosaur("tree", "backho", "3");
	}
	public void atys() {
		aty[0] = new Activity("Stroll", LocalDate.of(2024, 3, 3), 1);
		aty[1] = new Activity("meal", LocalDate.of(2024, 3, 5), 2);
		aty[2] = new Activity("chidbirth", LocalDate.of(2024, 3, 5), 3);
		aty[3] = new Activity("Fight", LocalDate.of(2024, 3, 5), 4);
		aty[4] = new Activity("treatment", LocalDate.of(2024, 3, 5), 5);		
	}
}