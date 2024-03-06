package apiexcercise;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class UsingK {
	public static void usingKeyboard() {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter age : ");
	if (sc.hasNextInt()) {
		int age = sc.nextInt();
		System.out.println(age);
	}
	System.out.println("this is the end");
	}
	
	public static void usingKeyboardExstra() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name : ");
		System.out.println(sc.nextLine());
	}
	
	public static void usingFile() {
		System.out.println(System.getProperty("user.dir"));
		try(Scanner sc = new Scanner(new File (System.getProperty("user.dir") 
				+ "\\sample1.txt"))) {
			
			if(sc.hasNextInt()) {
				int age = sc.nextInt();
				System.out.println(age);
			}
		}catch(FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}
				
	}
		
		public static void usingString() {
			String input = "Maaike delim vandelim Putten delim 22";
			Scanner sc = new Scanner(input).useDelimiter("\\s*delim\\s*");
			
			System.out.println(sc.next());
			System.out.println(sc.next());
			System.out.println(sc.next());
			System.out.println(sc.nextInt());
			sc.close();
		}

	public static void main(String[] args) {

		usingFile();

	}

}
