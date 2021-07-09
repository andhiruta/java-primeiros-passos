import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome = sc.next();
		Double salario, vendas, total;
		
		salario = sc.nextDouble();
		vendas = sc.nextDouble();
		total = (vendas * 0.15) + salario;
		
		System.out.printf("TOTAL = R$ %.2f%n", total);
		
		sc.close();
	}

}
