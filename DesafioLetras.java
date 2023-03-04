package desafios;

import java.util.Scanner;

public class DesafioLetras {

	public static void main(String[] args) {
//		Criar um programa que receba uma palavra 
//		e imprime no console letra por letra.
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a palavra: ");
		String palavra = sc.nextLine();

		char letras[] = palavra.toCharArray();

		for (int i = 0; i < letras.length; i++) {
			System.out.println(letras[i]);
		}

		sc.close();
	

		
		
		

	}

}
