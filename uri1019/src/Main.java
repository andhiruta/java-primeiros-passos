import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double tempo, horas, resto, minutos, segundos;
		
		tempo = sc.nextInt();
		
		horas = tempo / 3600;
		resto = tempo % 3600;
		
		minutos = resto / 60;
		segundos = resto % 60;
		
		System.out.println((int)horas + ":" + (int)minutos + ":" + (int)segundos);
		
		sc.close();

	}

}
