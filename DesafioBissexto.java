package desafios;

import java.util.Scanner;

public class DesafioBissexto {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		
		// Divisivel por 4
		// N�o divisivel por 100
		// Divisivel POR 400
	
	
		System.out.print("Digite o ano: ");
		int ano = sc.nextInt();
		
		if(ano % 4 == 0 || ano % 400 == 0 && ano % 100 != 0 ) {
			
			
		System.out.println("O Ano � Bissexto!");
			
			
		}else {
			
			
		System.out.println("O Ano n�o � Bissexto!");	
			
			
		}
		
				sc.close();
	}

}
