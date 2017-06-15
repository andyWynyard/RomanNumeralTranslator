import java.util.Scanner;

public class RomanNumeralsDriver {

	public static void main(String[] args) {
		boolean quit = true;
		while (quit) {
			Scanner kb = new Scanner(System.in);
			System.out.print("what number? ");
			int val = kb.nextInt();

			RomanNumeralsTranslator tr = new RomanNumeralsTranslator();
			System.out.println(tr.translate(val));

			System.out.print("Continue? ");
			boolean contin = Boolean.parseBoolean(kb.next());
			quit = contin;

		}

	}

}