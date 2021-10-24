import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int cont = 0;
		int numero;
		
		for(int i = 0; i < 5; i++) {
			numero = sc.nextInt();
			
			if(numero % 2 == 0) {
				cont++;
								
			}
			
			
		}
		System.out.println(cont + " valores pares");
		
		sc.close();
	}

}
