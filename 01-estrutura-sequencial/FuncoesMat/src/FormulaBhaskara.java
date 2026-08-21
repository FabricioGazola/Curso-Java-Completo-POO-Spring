import java.util.Scanner;

public class FormulaBhaskara {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double delta, x1, x2, a, b, c;
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		delta = Math.pow(b, 2.0) - 4*a*c;
		
		x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
		x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
		
		System.out.println("x1: " + x1);
		System.out.println("x2: " + x2);
		
		sc.close();
	}
}
