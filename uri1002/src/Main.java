import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double raio = x.nextDouble();
		double raio2 = Math.pow(raio, 2);
		double pi = 3.14159;
		
		double area = raio2 * pi;
		
		System.out.printf("A=%.4f%n", area);
		
		x.close();
	}

}
