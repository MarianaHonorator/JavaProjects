package desafios;

import java.util.Scanner;

public class DesafioPar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um numero: ");
		int num = sc.nextInt();

		if (num > 0 && num < 10) {

			System.out.println(num + " Est� entre 0 e 10");

		} else {

			System.out.println(num + " N�o est� entre 0 e 10");

		}

		if (num % 2 == 0) {

			System.out.println(num + " � Par");

		} else {

			System.out.println(num + " N�o � Par");

		}
		
		sc.close();
	}
}
