import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int segundos = sc.nextInt();
		int valor = segundos;
		int hora = segundos / 3600;
		valor = segundos % 3600;
		int minutos = valor / 60;
		int segundos2 = valor % 60;
		
		System.out.println(hora + ":" + minutos + ":" + segundos2);
		
		sc.close();
	}

}
