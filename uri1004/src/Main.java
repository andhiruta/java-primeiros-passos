import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int A, B, produto;
		
		A = sc.nextInt();
		B = sc.nextInt();
		produto = A * B;
		
		System.out.println("PROD = " + produto);
		
		sc.close();
	}

}
