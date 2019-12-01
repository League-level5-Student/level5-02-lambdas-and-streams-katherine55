package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.

		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.

		printCustomMessage((s) -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");

		// 2. Call the printCustonMessage method using a lambda so that the String
		// prints backwards.

		printCustomMessage((s) -> {
			String end = "";
			for (int i = s.length() - 1; i >= 0; i--) {
				end += s.charAt(i);
			}
			System.out.println(end);
		}, "backwards");

		// 3. Call the printCustonMessage method using a lambda so that the String
		// prints with a mix between upper an lower case characters.

		printCustomMessage((s) -> {
			String end = "";
			for (int i = 0; i < s.length(); i++) {
				if (i % 2 == 0) {
					end += Character.toUpperCase(s.charAt(i));
				} else {
					end += s.charAt(i);
				}
			}
			System.out.println(end);
		}, "mixed");

		// 4. Call the printCustonMessage method using a lambda so that the String
		// prints with a period in between each character.

		printCustomMessage((s) -> {
			String end = "" + s.charAt(0);
			for (int i = 1; i < s.length(); i++) {
				end += "." + s.charAt(i);
			}
			System.out.println(end);
		}, "period");

		// 5. Call the printCustonMessage method using a lambda so that the String
		// prints without any vowels.

		printCustomMessage((s) -> {
			String end = "";
			for (int i = 0; i < s.length(); i++) {
				Character ch = s.charAt(i);
				if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O'
						|| ch == 'u' || ch == 'U') {}
				else {
					end += s.charAt(i);
				}
			}
			System.out.println(end);
		}, "consonant");
	}

	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
