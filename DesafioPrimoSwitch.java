package desafios;

import java.util.Scanner;

public class DesafioPrimoSwitch {

	public static void main(String[] args) {
		
		/** 5. Refatorar o exercício 04, utilizando a estrutura switch. */

		int contadorDeDivisores = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("\nDigite um numero para verificar se é primo:");
		int numero = sc.nextInt();

		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				contadorDeDivisores++;
			}
		}

		switch (contadorDeDivisores) {

		case 0:
			System.out.println("O numero " + numero + " é um numero primo.");
			break;

		default:
			System.out.println("O numero " + numero + "  não é um numero primo.");

		}

		sc.close();

	}

	}


