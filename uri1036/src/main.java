import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double valor1 = sc.nextDouble();
		double valor2 = sc.nextDouble();
		double valor3 = sc.nextDouble();
		
		double delta = (valor2 * valor2) - 4 * valor1 * valor3;
		double bhaskara1 = ((-valor2) + Math.sqrt(delta)) / (2 * valor1);
		double bhaskara2 = ((-valor2) - Math.sqrt(delta)) / (2 * valor1);
		
		if (delta < 0 || valor1 == 0) {
			System.out.println("Impossivel calcular");
		
		} else {
			System.out.printf("R1 = %.5f%n", bhaskara1);
			System.out.printf("R2 = %.5f%n", bhaskara2);
		}
		
		sc.close();
		
		
		
	}

}
