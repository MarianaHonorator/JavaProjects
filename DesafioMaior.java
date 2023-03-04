package desafios;

import java.util.Scanner;

public class DesafioMaior {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);


	int maior = 0;
	
	System.out.println("Digite 10 numeros: ");
	for (int i = 0; i < 10; i++) {
	int valor = sc.nextInt();
	
	
	if(i == 0) {
		
		maior = valor;
		
	}
	
	if(valor > maior) {
		
		maior = valor;
		
		
	}
	
		
	}
	
	System.out.println("O maior valor é " + maior);
	
	
	
	

	sc.close();


	}

}
