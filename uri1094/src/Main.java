import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int testes = sc.nextInt();
		int coelhos = 0;
		int ratos = 0;
		int sapos = 0;
		
		for(int i = 0; i < testes; i++) {
			
			int quantidade = sc.nextInt();
			char tipo = sc.next().charAt(0);
			
			if(tipo == 'C') {
				coelhos = coelhos + quantidade;
				
			} else if (tipo == 'R') {
				ratos = ratos + quantidade;
								
			} else if (tipo == 'S') {
				sapos = sapos + quantidade;
				
			}
		}
			
		int total = coelhos + ratos + sapos;
		double porcentagemCoelhos = (double) coelhos / total * 100.0;
		double porcentagemRatos = (double) ratos / total * 100.0;
		double porcentagemSapos = (double) sapos / total * 100.0;
		
		System.out.println("Total: " + total + " cobaias");
		System.out.println("Total de coelhos: " + coelhos);
		System.out.println("Total de ratos: " + ratos);
		System.out.println("Total de sapos: " + sapos);
		System.out.printf("Percentual de coelhos: %.2f %%%n", porcentagemCoelhos);
		System.out.printf("Percentual de ratos: %.2f %%%n", porcentagemRatos);
		System.out.printf("Percentual de sapos: %.2f %%%n", porcentagemSapos);
		
		sc.close();
	}

}
