import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, maiorx, maiory;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		maiorx = (A + B + Math.abs(A - B)) / 2;
		maiory = (maiorx + C + Math.abs(maiorx - C)) / 2;
		
		System.out.println(maiory + " eh o maior");
		
		sc.close();

	}

}
