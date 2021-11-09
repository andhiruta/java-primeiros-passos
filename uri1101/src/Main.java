import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int cont = 0;
		
	while(num1 != 0 || num2 != 0) {
		
	
		if(num1 > num2 ) {
			
			for(int i = num2; num1 >= i; i++) {
				cont += i;
				System.out.println(i + " ");
							
			}
										
		}
			
		if(num1 < num2) {
			
			for(int i = num1; num2 >= i; i++) {
				cont += i;
				System.out.println(i + " ");
			}
			
		}
		
		System.out.println("SUM=" + cont);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		cont = 0;
	}		
		
		sc.close();
	}

}
