import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int maior = sc.nextInt();
		int posicao = 1;
		
		for(int i = 2; i <= 100; i++) {
			int valor = sc.nextInt();
			if(valor > maior ) {
				maior = valor;
				posicao = i;
			}
						
		}
		System.out.println(maior);
		System.out.println(posicao);
		
		sc.close();
	}

}
