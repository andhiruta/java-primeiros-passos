import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int valor = sc.nextInt();
		
		for(int i = 1 ; i <= 10; i++) {
			
			if(valor > 2 && valor < 1000) {
				int resultado = valor * i;
				
				System.out.println(i + " x " + valor + " = " + resultado);
			}
			
		}
				
		
		
		
		sc.close();
	}

}
