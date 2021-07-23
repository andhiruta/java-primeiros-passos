import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		double preco = 0.0;
		
		if(codigo == 1) {
			preco = 4.00;
			System.out.printf("Total: R$ %.2f%n", (quantidade * preco));
		}
		if(codigo == 2) {
			preco = 4.50;
			System.out.printf("Total: R$ %.2f%n", (quantidade * preco));
		}
		if(codigo == 3) {
			preco = 5.00;
			System.out.printf("Total: R$ %.2f%n", (quantidade * preco));
		}
		if(codigo == 4) {
			preco = 2.00;
			System.out.printf("Total: R$ %.2f%n", (quantidade * preco));
		}
		if(codigo == 5) {
			preco = 1.50;
			System.out.printf("Total: R$ %.2f%n", (quantidade * preco));
		}
		sc.close();

	}

}
