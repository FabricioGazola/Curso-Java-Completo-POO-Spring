import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int rep = sc.nextInt();
		
		for (int i=0; i<rep; i++) {
			
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if (y == 0) {
				System.out.println("divisao impossivel");
			}
			else {
				double resDiv = (double) x / y;
				System.out.printf("%.1f%n", resDiv);
			}
		}
		
		sc.close();
	}
}