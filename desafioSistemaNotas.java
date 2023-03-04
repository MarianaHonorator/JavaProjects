package desafios;

import java.util.Locale;
import java.util.Scanner;

public class desafioSistemaNotas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		double total = 0;
		Double media;

		System.out.print("Quantos alunos? ");
		int qtdAlunos = sc.nextInt();

		System.out.print("Quantas notas por aluno? ");
		int qtdNotas = sc.nextInt();

		System.out.println();

		double[][] mat = new double[qtdAlunos][qtdNotas];
		String[] vet = new String[qtdAlunos];

		for (int i = 0; i < qtdAlunos; i++) {
			System.out.print("Nome do aluno: ");
			vet[i] = sc.next().trim().toUpperCase();
			System.out.println("Notas: ");

			for (int j = 0; j < qtdNotas; j++) {

				mat[i][j] = sc.nextDouble();
				total += mat[i][j];

			}
		}

		for (int i = 0; i < qtdAlunos; i++) {

			System.out.println();
			System.out.printf("NOTAS DE  %s: ", vet[i]);

			for (int j = 0; j < qtdNotas; j++) {

				if (qtdNotas == 1) {

					System.out.print(mat[i][j]);

				} else {

					System.out.print(mat[i][j] + " / ");
				}

			}

		}
		System.out.println();
		media = total/(qtdAlunos * qtdNotas);
		System.out.printf("Média da turma: %s ", media.toString().replace(",", "."));

		sc.close();
	}

}
