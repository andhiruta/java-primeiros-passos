import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float n1 = sc.nextFloat();
		float n2 = sc.nextFloat();
		float n3 = sc.nextFloat();
		float n4 = sc.nextFloat();
		float resultado = ((2 * n1) + (3 * n2) + (4 * n3) + n4) / 10;
		
		System.out.printf("Media: %.1f%n", resultado);
		
		if(resultado >= 7.0) {
			System.out.println("Aluno aprovado.");
		}
		
		else if (resultado < 5.0) {
			System.out.println("Aluno reprovado.");

		}
	
		else {
			System.out.println("Aluno em exame.");
		}
		
		if(resultado >= 5 && resultado <= 6.9) {
			float exame = sc.nextFloat();
			float mediaExame = (resultado + exame) / 2;
			System.out.printf("Nota do exame: %.1f%n", exame);
			if(mediaExame >= 5.0) {
				System.out.println("Aluno aprovado.");
									
			}
			else {
				System.out.println("Aluno reprovado.");
				
			}
		
		System.out.printf("Media final: %.1f%n", mediaExame);
		}
		
		
		sc.close();
		
	}

}
