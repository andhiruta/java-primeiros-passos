import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String filo = sc.next();
		String classe = sc.next();
		String ordem = sc.next();
		
		if(filo.equals("vertebrado")) {
			
			if(classe.equals("ave")) {
				
				if(ordem.equals("carnivoro")) {
					System.out.println("aguia");
					
				}
				
				else {
					System.out.println("pomba");
				}
			}
			else if(classe.equals("mamifero")) {
					
				if(ordem.equals("onivoro")) {
					System.out.println("homem");
								
				} else {
					System.out.println("vaca");
				}
				
			}
			
			
		} else {
			
			if(classe.equals("inseto")) {
				
				if(ordem.equals("hematofago")) {
					System.out.println("pulga");
				
				} else {
					System.out.println("lagarta");
				}
				
			} else {
				
				if(classe.equals("anelideo")) {
					
					if(ordem.equals("hematofago")) {
						System.out.println("sanguessuga");
						
					} else {
						System.out.println("minhoca");
					}
				} 
					
					
				}
			}
			
			
		sc.close();	
		}
		
		

	
	}




