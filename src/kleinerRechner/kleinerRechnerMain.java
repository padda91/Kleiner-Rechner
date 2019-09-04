package kleinerRechner;

import java.util.Scanner;

public class kleinerRechnerMain {

	public static void main(String[] args) {
		double x, y, z;
		String s;
		Scanner scan = new Scanner(System.in);

		System.out.println("Bitte Variable x eingeben");
		x = scan.nextDouble();

		System.out.println("Bitte Variable y eingeben");
		y = scan.nextDouble();

		System.out.println("Bitte Operator eingeben [ ] = " + x + " [+][-][*][/] " + y);
		s = scan.next();
		z = rechnen(x, y, s);

		
	}

	private static double rechnen(double x, double y, String s) {
		double z = 0;

		if (s.equals("+"))
			z = x + y;
		if (s.equals("-"))
			z = x - y;
		if (s.equals("*"))
			z = x * y;
		if (s.equals("/"))
			z = x / y;
		else {
			System.out.println("Eingabe enthielt fehlerhafte Zeichen");
			return z;
		}
		return z;

	}

}
