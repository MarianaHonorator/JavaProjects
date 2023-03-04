package desafios;

import java.util.Locale;
import java.util.Scanner;

public class DesafioNota {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		System.out.println("Digite a 1° nota: ");
		double nota1 = sc.nextDouble();
		System.out.println("Digite a 2a° nota: ");
		double nota2 = sc.nextDouble();
		
		double media = (nota1 + nota2)/2;
		
		if(media > 7.0) {
			
			System.out.println("Aprovado");
			
		} else if(media < 7.0 && media > 4.0){
			
			
			System.out.println("Recuperação");
			
			
		}else{
			
			
			System.out.println("Reprovado");
			
			
		}

		sc.close();

	}

}
