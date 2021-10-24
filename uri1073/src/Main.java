import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int valor = sc.nextInt();
		int resultado = 0;
		
		for(int i = 1; i <= valor; i++) {
			
			if(i % 2 == 0) { 
			resultado = (int) Math.pow(i, 2);
						
			System.out.println(i + "^2 = " + resultado);
			}
		}
		
		
		
		sc.close();
	}

}
