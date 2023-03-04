package desafios;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class DesafioFahrenheitCelsius {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String F = JOptionPane.showInputDialog("Digite a temperatura em Fahrenheit: ");

		Double valor1 = Double.parseDouble(F);

		Double resultado = ((valor1 - 32) * 5) / 9;


		JOptionPane.showMessageDialog(null, F + " °F é igual a  " + resultado + " °C");

	}

}
