package apiexcercise;

public class StringVersusStringVuilder {
	public static void whatHappens(String s, StringBuilder sd) {
		s = s.concat("there!");
		sd.append("there!");
		System.out.println("what Happens : " + s);
		System.out.println("what Happens : " + sd);
	}
	public static void main(String[] args) {
		String s = "Hi ";
		StringBuilder sd = new StringBuilder("Hi ");
		whatHappens(s,sd);
		System.out.println("main : " + s);
		System.out.println("mailn : " + sd);
	}

}
