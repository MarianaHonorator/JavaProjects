package desafios;

import java.util.Random;
import java.util.Scanner;

public class DesafioAdivinhacao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Random gerador = new Random();

		int num = gerador.nextInt(101);

		int contador = 10;

		for (int i = 1; i <= 10; i++) {

			System.out.print(i + "� Tentativa: ");
			int resp = sc.nextInt();

			if (resp != num) {
				contador -= 1;
				if (resp > num) {

					System.out.println();
					System.out.println("Voc� errou!");
					System.out.println(resp + " � maior que o numero sorteado");
					System.out.println("Voc� tem: " + contador + " tentativa(s)");
					System.out.println();

				}

				if (resp < num) {

					System.out.println();
					System.out.println("Voc� errou!");
					System.out.println(resp + " � menor que o numero sorteado");
					System.out.println("Voc� tem: " + contador + " tentativa(s)");
					System.out.println();

				}

			}

			if (resp == num) {

				System.out.println();
				System.out.println("YOU WIN!!");
				System.out.println("O numero sorteda foi: " + num);
				break;

			}

		}

		if (contador == 0) {
			System.out.println();
			System.out.println("GAME OVER");
			System.out.println("O numero sorteda foi: " + num);

		}

		sc.close();
	}

}
