import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int tempo, velocidade;
		double combust;
		
		tempo = sc.nextInt();
		velocidade = sc.nextInt();
		combust = (tempo * velocidade) / 12.0;
		
		System.out.printf("%.3f%n", combust);
		
		sc.close();
	}

}
