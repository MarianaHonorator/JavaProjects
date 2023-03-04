package desafios;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class DesafioEquacao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String valor1 = JOptionPane.showInputDialog("Digite o valor de a: ");
		String valor2 = JOptionPane.showInputDialog("Digite o valor de b: ");
		String valor3 = JOptionPane.showInputDialog("Digite o valor de c: ");

		JOptionPane.showMessageDialog(null, "Sua express�o: " + valor1 + "x�" + " + " + " (" + valor2 + ") " + "x"
				+ " + " + " (" + valor3 + ") " + "= 0");

		Integer a = Integer.parseInt(valor1);
		Integer b = Integer.parseInt(valor2);
		Integer c = Integer.parseInt(valor3);

		Integer delta = (int) Math.pow(b, 2) - 4 * a * c;
		Integer x1 = ((-b) + (int) Math.sqrt(delta)) / 2 * a;
		Integer x2 = ((-b) - (int) Math.sqrt(delta)) / 2 * a;

		if (delta < 0) {

			System.out.println("Essa express�o n�o possui raiz!!");
			

		}

		JOptionPane.showMessageDialog(null, "Raiz(es) da express�o: S{" + x1 + "," + x2 + "}");

	}

}
