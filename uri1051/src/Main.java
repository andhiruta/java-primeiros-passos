import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario = sc.nextDouble();
		
		if(salario >= 0.00 && salario <= 2000.00) {
			System.out.println("Isento");
			
		}else if(salario >= 2000.01 && salario <= 3000.00) {
			double imposto = (salario - 2000.00) * 0.08;
			System.out.printf("R$ %.2f%n", imposto);
			
		}else if(salario >= 3000.01 && salario <= 4500.00) {
			double imposto1 = 1000.00 * 0.08;
			double imposto2	= (salario - 3000.00) * 0.18;
			double somaImposto = imposto1 + imposto2;
			System.out.printf("R$ %.2f%n", somaImposto);
						
		}else {
			double imposto3 = 1000.00 * 0.08;
			double imposto4 = 1500.00 * 0.18;
			double imposto5 = (salario - 4500.00) * 0.28;
			double somaImposto1 = imposto3 + imposto4 + imposto5;
			System.out.printf("R$ %.2f%n", somaImposto1); 
		}
			
		
		
		
		
		
		
		
		sc.close();
		

	}

}
