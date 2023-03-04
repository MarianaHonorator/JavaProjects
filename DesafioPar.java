package desafios;

import java.util.Scanner;

public class DesafioPar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um numero: ");
		int num = sc.nextInt();

		if (num > 0 && num < 10) {

			System.out.println(num + " Está entre 0 e 10");

		} else {

			System.out.println(num + " Não está entre 0 e 10");

		}

		if (num % 2 == 0) {

			System.out.println(num + " é Par");

		} else {

			System.out.println(num + " Não é Par");

		}
		
		sc.close();
	}
}
