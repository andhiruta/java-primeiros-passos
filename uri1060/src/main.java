import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cont = 0;	
		for(int i = 0; i < 6; i++) {
			double num = sc.nextDouble();
			if(num > 0) cont++;
						
		}
		
		System.out.println(cont + " valores positivos");
		
		sc.close();
	}

}
