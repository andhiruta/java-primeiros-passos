import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cont = 0;
		double numero;
		double media = 0;
		for(int i = 0; i < 6; i++) {
			numero = sc.nextDouble();
				
				if(numero > 0) {
					cont++;
					media += numero;
				}
				
			

		}
		media = media / cont;
		System.out.println(cont + " valores positivos");
		System.out.printf("%.1f%n", media);
		sc.close();
		
	}

}
