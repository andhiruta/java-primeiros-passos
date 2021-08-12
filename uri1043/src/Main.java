import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double perimetro = a + b + c;
		double area = ((a + b) / 2) * c;
		
		  if ((a < b + c) && (b < a + c) && (c < b + a)) {
	            perimetro = a + b + c;
	            System.out.printf("Perimetro = %.1f%n", perimetro);
	      } else {
	            area = ((a + b) * c) / 2;
	            System.out.printf("Area = %.1f%n", area);
	      }
		sc.close();

	}

}
