package apiexcercise;

public class StringTest {
	
	public static void howManyObjectString() {
		String s = "The ";
		s += "quick ";
		System.out.println(s);
		
		s.concat("brown fox");
		System.out.println(s);
		s= s.concat("brown fox");
		System.out.println(s);
	}
	
	
class StringVersusStringVuilder{

	
}
	public static void main(String[] args) {
		howManyObjectString();
	}

}
