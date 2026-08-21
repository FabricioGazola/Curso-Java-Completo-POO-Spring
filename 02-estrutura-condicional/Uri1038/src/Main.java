import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int cod = sc.nextInt();
		int quant = sc.nextInt();
		
		switch (cod) {
		case 1:
			double preco1 = quant * 4.00;
			System.out.printf("Total: R$ %.2f%n", preco1);
			break;
		case 2:
			double preco2 = quant * 4.50;
			System.out.printf("Total: R$ %.2f%n", preco2);
			break;
		case 3:
			double preco3 = quant * 5.00;
			System.out.printf("Total: R$ %.2f%n", preco3);
			break;
		case 4:
			double preco4 = quant * 2.00;
			System.out.printf("Total: R$ %.2f%n", preco4);
			break;
		case 5:
			double preco5 = quant * 1.50;
			System.out.printf("Total: R$ %.2f%n", preco5);
			break;
		}
		
		sc.close();
	}
}