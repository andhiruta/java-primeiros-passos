import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario = sc.nextDouble();
		
		if(salario >= 0.0 && salario <= 400.00) {
			double percentual = 15.0;
			double reajuste = salario * 0.15;
			double novoSalario = salario + reajuste;
			System.out.printf("Novo salario: %.2f%n", novoSalario );
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.printf("Em percentual: %.0f %%%n", percentual);
			
		}
		
		if(salario > 400.00 && salario <= 800.00) {
			double percentual = 12.0;
			double reajuste = salario * 0.12;
			double novoSalario = salario + reajuste;
			System.out.printf("Novo salario: %.2f%n", novoSalario );
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.printf("Em percentual: %.0f %%%n", percentual);
			
		}
		
		if(salario > 800.00 && salario <= 1200.00) {
			double percentual = 10.0;
			double reajuste = salario * 0.10;
			double novoSalario = salario + reajuste;
			System.out.printf("Novo salario: %.2f%n", novoSalario );
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.printf("Em percentual: %.0f %%%n", percentual);
			
		}
		
		if(salario > 1200.00 && salario <= 2000.00) {
			double percentual = 7.0;
			double reajuste = salario * 0.07;
			double novoSalario = salario + reajuste;
			System.out.printf("Novo salario: %.2f%n", novoSalario );
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.printf("Em percentual: %.0f %%%n", percentual);
		}
		
		if(salario > 2000.00) {
			double percentual = 4.0;
			double reajuste = salario * 0.04;
			double novoSalario = salario + reajuste;
			System.out.printf("Novo salario: %.2f%n", novoSalario );
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.printf("Em percentual: %.0f %%%n", percentual);
		}
		sc.close();

	}

}
