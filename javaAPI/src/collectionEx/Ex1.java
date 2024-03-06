package collectionEx;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class Dinosaur{
	String name;
	int dangerLevel;
	
	public Dinosaur(String name, int dangerLevel){
		this.name = name;
		this.dangerLevel = dangerLevel;
	}
	public String getName(){
		return name;
	}
	public int getDangerLevel() {
		return dangerLevel;
	}
	
}

public class Ex1 {
	public static void main(String[] args) {
		List<Dinosaur> dino = new ArrayList<>();
		dino.add(new Dinosaur("티라노", 4));
		dino.add(new Dinosaur("케토톱", 5));
		dino.add(new Dinosaur("둘리", 1));
		dino.add(new Dinosaur("천배루스",2));
		
		Comparator<Dinosaur> com = new Comparator<Dinosaur>() {
			@Override
			public int compare(Dinosaur d1, Dinosaur d2) {
				return Integer.compare(d1.getDangerLevel(), d2.getDangerLevel());
				}
			};
			PriorityQueue<Dinosaur> pq = new PriorityQueue<>(com);
			
			 pq.addAll(dino);
			
			while(!pq.isEmpty()) {
				Dinosaur dinosaur = pq.poll();
				System.out.println("Name : " + dinosaur.getName() + "Danger Lever : " + dinosaur.getDangerLevel());
		
		}
		
		
	}

}
