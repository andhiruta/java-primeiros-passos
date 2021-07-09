import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int funcNum, hora;
		double valorHora, salario;
		
		funcNum = sc.nextInt();
		hora = sc.nextInt();
		valorHora = sc.nextDouble();
		salario = hora * valorHora;
		
		System.out.println("NUMBER = " + funcNum);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		sc.close();
			
		

	}

}
