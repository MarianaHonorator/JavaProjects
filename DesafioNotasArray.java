package desafios;

import java.util.Locale;
import java.util.Scanner;

public class DesafioNotasArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		double total = 0, media = 0;
       
		System.out.print("Quantas notas ira inserir? ");
		int qtd = sc.nextInt();


		double[] notas = new double[qtd];
		
		for (int i = 0; i < qtd; i++) {
			
		System.out.printf("%d ° nota: ", i + 1);
		notas[i] = sc.nextDouble();
		
		total += notas[i];
			
		}
		
		System.out.print("Notas: | ");
		for (double nota: notas) {
		
			System.out.print(nota + " | ");
			
		}
		
		
		media = total/qtd;
		System.out.println();
		System.out.printf("A média do aluno foi %.2f", media);
		System.out.println();
	
		if(media > 6.0) {
			
			//System.out.printf("A média do aluno foi %.2f", media);
			System.out.println("APROVADO!!");
		}
		
		
		if(media < 6.0) {
			
			//System.out.printf("A média do aluno foi %.2f", media);
			System.out.println("REPROVADO!!");
		}
		
		
		
				sc.close();

	}

}
