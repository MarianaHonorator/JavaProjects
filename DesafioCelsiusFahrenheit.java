package desafios;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class DesafioCelsiusFahrenheit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String C = JOptionPane.showInputDialog("Digite a temperatura em Celsius: ");

		Double valor1 = Double.parseDouble(C);

		Double resultado = (valor1 * 9) / 5 + 32;

		JOptionPane.showMessageDialog(null, C + " °C " + "é igual a " + resultado + " °F");

	}

}
