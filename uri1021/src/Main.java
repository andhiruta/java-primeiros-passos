import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double valor;
		int valorFinal;
		valor = sc.nextDouble();
		valorFinal = (int)(valor * 100.0 + 0.5);		
		System.out.println("NOTAS:");
		
		System.out.println(valorFinal / 10000 + " nota(s) de R$ 100.00");
		valorFinal = valorFinal % 10000;
		System.out.println(valorFinal / 5000 + " nota(s) de R$ 50.00");
		valorFinal = valorFinal % 5000;
		System.out.println(valorFinal/ 2000 + " nota(s) de R$ 20.00");
		valorFinal = valorFinal % 2000;
		System.out.println(valorFinal / 1000 + " nota(s) de R$ 10.00");
		valorFinal = valorFinal % 1000;
		System.out.println(valorFinal / 500 + " nota(s) de R$ 5.00");
		valorFinal = valorFinal % 500;
		System.out.println(valorFinal / 200 + " nota(s) de R$ 2.00");
		valorFinal = valorFinal % 200;
			
		System.out.println("MOEDAS:");
		
		System.out.println(valorFinal / 100 + " moedas(s) de R$ 1.00");
		valorFinal = valorFinal % 100;
		System.out.println(valorFinal / 50 + " moedas(s) de R$ 0.50");
		valorFinal = valorFinal % 50;
		System.out.println(valorFinal / 25 + " moedas(s) de R$ 0.25");
		valorFinal = valorFinal % 25;
		System.out.println(valorFinal / 10 + " moedas(s) de R$ 0.10");
		valorFinal = valorFinal % 10;
		System.out.println(valorFinal / 5 + " moedas(s) de R$ 0.05");
		valorFinal = valorFinal % 5;
		System.out.println(valorFinal + " moedas(s) de R$ 0.01");
		
		sc.close();

	}

}
