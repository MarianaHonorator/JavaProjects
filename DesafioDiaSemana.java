package desafios;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Domingo -> 1
		// Segunda -> 2
		// Terça -> 3
		// Quarta -> 4
		// Quinta -> 5
		// Sexta -> 6
		// Sábado -> 7

		System.out.print("Digite o dia da semana: ");
		String resp = sc.next().toLowerCase();

		if (resp.equals("domingo")) {

			System.out.println(1);

		} else if (resp.equals("segunda")) {

			System.out.println(2);

		} else if (resp.equals("terça")) {

			System.out.println(3);

		} else if (resp.equals("quarta")) {

			System.out.println(4);

		} else if (resp.equals("quinta")) {

			System.out.println(5);

		} else if (resp.equals("sexta")) {

			System.out.println(6);

		} else {

			System.out.println(7);

		}
		
		sc.close();

	}
}
