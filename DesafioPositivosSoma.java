package desafios;

import java.util.Scanner;

public class DesafioPositivosSoma {

	public static void main(String[] args) {
		// Criar um programa que enquanto estiver recebendo números positivos, imprime
		// no console a soma dos números inseridos, caso receba um número negativo,
		// encerre o programa. Tente utilizar a estrutura do while.
		
		Scanner sc = new Scanner(System.in);


		int num = 1, soma = 0;
		
		
		while(num > 0) {
			
			System.out.print("Digite um numero: ");
			num = sc.nextInt();
			soma += num;
			
			
			
			
			
		}
		
		System.out.println("Soma dos numeros: " + (soma - num));

	
		sc.close();
	}

}
