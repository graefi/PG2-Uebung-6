import java.util.Scanner;

public class Aufgabe3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int strLength = input.length();
		String firstHalf = input.substring(0, strLength / 2);
		String secondHalf = input.substring(strLength / 2);
		String output = secondHalf + firstHalf;
		System.out.println("Ausgabe: " + output);
	}

}
