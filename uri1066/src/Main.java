import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int contPar = 0;
		int contImpar = 0;
		int contPositivo = 0;
		int contNegativo = 0;
		int numero;
		
		for(int i = 0; i < 5; i++) {
			numero = sc.nextInt();
			
			if(numero % 2 == 0) {
				contPar++;
				
			} else {
				contImpar++;
				
			}
			if(numero > 0) {
				contPositivo++;
				
			} else if(numero < 0) {
				contNegativo++;
			}
			
			
		}
		
		System.out.println(contPar + " valor(es) par(es)");
		System.out.println(contImpar + " valor(es) impar(es)");
		System.out.println(contPositivo + " valor(es) positivo(s)");
		System.out.println(contNegativo + " valor(es) negativo(s)");
		
		
		sc.close();
		
	}

}
