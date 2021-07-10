import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codPeca1, numPeca1, codPeca2, numPeca2;
		double precoPeca1, precoPeca2, total;
		
		codPeca1 = sc.nextInt();
		numPeca1 = sc.nextInt();
		precoPeca1 = sc.nextDouble();
		codPeca2 = sc.nextInt();
		numPeca2 = sc.nextInt();
		precoPeca2 = sc.nextDouble();
		total = (numPeca1 * precoPeca1) + (numPeca2 * precoPeca2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		
		sc.close();

	}

}
