import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		int somaPar = 0;
		int somaImpar = 0;
		while(numero != 0) {
			if(numero % 2 == 0) {
				somaPar = numero + (numero + 2) + (numero + 4) + (numero + 6) + (numero + 8);
				System.out.println(somaPar);
				numero = sc.nextInt();
			}else {
				somaImpar = (numero + 1) + (numero + 3) + (numero + 5) + (numero + 7) + (numero + 9);
				System.out.println(somaImpar);
				numero= sc.nextInt();
		}
		
		}
		
		sc.close();

	}

}
