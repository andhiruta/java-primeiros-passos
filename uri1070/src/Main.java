import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
				
		int numero = sc.nextInt();
		int cont = 0;
		
		while(cont < 6) {
			
			if(numero % 2 != 0) {
				System.out.println(numero);
				cont++;
			}
			numero++;
			
		}
	
		sc.close();
		
	}	
	

}		