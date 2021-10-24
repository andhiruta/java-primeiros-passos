import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		
		for(int i = 1; i <= 10000; i++) {
			
			if(i % numero == 2) {
				System.out.println(i);
			}
			
		}
		
		
		sc.close();
		
	}

}
