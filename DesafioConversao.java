package desafios;

import java.util.Scanner;


public class DesafioConversao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	

		String num1, num2, num3;

		System.out.println("Digite os salarios dos proximos 3 meses");

		System.out.print("-->");
		num1 = sc.nextLine().replace(",", ".");
		System.out.print("-->");
		num2 = sc.nextLine().replace(",", ".");
		System.out.print("-->");
		num3 = sc.nextLine().replace(",", ".");

		double valor1 = Double.parseDouble(num1);
		double valor2 = Double.parseDouble(num2);
		double valor3 = Double.parseDouble(num3);

		var media = (valor1 + valor2 + valor3) / 3;

		System.out.println("A média é " + media);

		sc.close();
	}

}
