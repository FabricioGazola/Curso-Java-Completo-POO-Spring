import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int A, B, Soma;
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		Soma = A + B;
		
		System.out.println("SOMA = " + Soma);
		
		sc.close();

	}

}
