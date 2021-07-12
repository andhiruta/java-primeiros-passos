import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int dist;
		double gas, consumo;
		
		dist = sc.nextInt();
		gas = sc.nextDouble();
		consumo = dist / gas;
		
		System.out.printf("%.3f km/l%n", consumo);

	}

}
