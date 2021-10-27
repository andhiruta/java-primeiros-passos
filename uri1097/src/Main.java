
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 1;
		int j = 7;
		
		while(i <= 9) {
			
			for(int cont = 0; cont < 3; cont++) {
				
				System.out.println("I=" + i + " J=" + j);
				j--;
			}
			j += 5;
			i += 2;
		}
		
		
		}
		
	}


