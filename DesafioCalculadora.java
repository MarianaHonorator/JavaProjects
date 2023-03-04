package desafios;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class DesafioCalculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Ler num1
		// Ler num2
		// + - * / %

		String num1 = JOptionPane.showInputDialog("Digite o primeiro numero: ");
		String num2 = JOptionPane.showInputDialog("Digite o segundo numero: ");
		String op = JOptionPane.showInputDialog("Digite a operação: ");

		Double valor1 = Double.parseDouble(num1);
		Double valor2 = Double.parseDouble(num2);
		
		double resultado = "+".equals(op) ? valor1 + valor2 : 0;
		resultado = "-".equals(op) ? valor1 - valor2 : resultado;
		resultado = "/".equals(op) ? valor1 / valor2 : resultado;
		resultado = "*".equals(op) ? valor1 * valor2 : resultado;
		
		
		JOptionPane.showMessageDialog(null, num1 + " " + op + " " + num2 + " = " + resultado);
		
		
		sc.close();

	}

}
