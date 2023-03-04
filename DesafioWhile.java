package desafios;

import java.util.Locale;
import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		String resp = "Sim";
		double total = 0;
		Double media;
		int i = 0;

		while (resp.equalsIgnoreCase("Sim")) {

			i++;

			System.out.print("Digite a nota do " + i + "° " + "estudante: ");
			double nota = sc.nextDouble();

			if (nota > 10 || nota < 0) {

				System.out.println("Nota Inválida! Digite Novamente");

				if (i == 1) {

					i = 0;
					continue;

				} else if (i > 1) {

					i = i - 1;
					continue;

				}

			}

			System.out.println("Deseja digitar outra nota? ");
			sc.nextLine();
			resp = sc.next();

			total += nota;

		}

		media = total / i;

		System.out.println("Total de notas válidas: " + i);
		System.out.print("Média de notas da turma: " + media.toString().format("%.2f", media).replace(",", "."));

		sc.close();

	}

}
