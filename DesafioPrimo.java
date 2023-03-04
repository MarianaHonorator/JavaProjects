package desafios;

import java.util.Scanner;

public class DesafioPrimo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int contadorDeDivisores = 0;
		

		System.out.println("\nDigite um numero para verificar se é primo:");
		int numero = sc.nextInt();

		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				contadorDeDivisores++;
			}
		}

		if (contadorDeDivisores == 0) {
			System.out.println("\nO numero " + numero + " é primo.");
		} else {
			System.out.println("\nO numero " + numero + " não é primo.");
		}

		sc.close();

	}

}
