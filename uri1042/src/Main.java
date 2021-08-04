import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int primeiroValor = sc.nextInt();
		int segundoValor = sc.nextInt();
		int terceiroValor = sc.nextInt();
		
		if(primeiroValor > segundoValor && primeiroValor > terceiroValor && segundoValor > terceiroValor) {
			System.out.println(terceiroValor);
			System.out.println(segundoValor);
			System.out.println(primeiroValor);
						
		} else if(segundoValor > primeiroValor && segundoValor > terceiroValor && primeiroValor > terceiroValor) {
			System.out.println(terceiroValor);
			System.out.println(primeiroValor);
			System.out.println(segundoValor);
			
		} else if(segundoValor > primeiroValor && segundoValor > terceiroValor && terceiroValor > primeiroValor) {
			System.out.println(primeiroValor);
			System.out.println(terceiroValor);
			System.out.println(segundoValor);
						
		} else if(primeiroValor > segundoValor && primeiroValor > terceiroValor && terceiroValor > segundoValor) {
			System.out.println(segundoValor);
			System.out.println(terceiroValor);
			System.out.println(primeiroValor);
		
		} else if(terceiroValor > primeiroValor && terceiroValor > segundoValor && primeiroValor > segundoValor) {
			System.out.println(segundoValor);
			System.out.println(primeiroValor);
			System.out.println(terceiroValor);
			
		} else {
			System.out.println(primeiroValor);
			System.out.println(segundoValor);
			System.out.println(terceiroValor);
		}
		
		
		System.out.println("");
		System.out.println(primeiroValor);
		System.out.println(segundoValor);
		System.out.println(terceiroValor);
		
		
		
		
		
		sc.close();

	}

}
