import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int horaInicial = sc.nextInt();
		int minutoInicial = sc.nextInt();
		int horaFinal = sc.nextInt();
		int minutoFinal = sc.nextInt();
		
		int conversaoHoraInicial = horaInicial * 60 + minutoInicial;
		int conversaoHoraFinal = horaFinal * 60 + minutoFinal;
		int resultado;
		
		if(conversaoHoraInicial < conversaoHoraFinal) {
			resultado = conversaoHoraFinal - conversaoHoraInicial;
			
		}
		
		else {
			resultado = (24 * 60 - conversaoHoraInicial) + conversaoHoraFinal;
		}
		int resultadoHoras = resultado / 60;
		int resultadoMinutos = resultado % 60;
		
		System.out.println("O JOGO DUROU " + resultadoHoras + " HORA(S) E " + resultadoMinutos + " MINUTO(S)");
		
		sc.close();

	}

}
