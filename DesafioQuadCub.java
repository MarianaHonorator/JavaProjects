package desafios;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class DesafioQuadCub {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String valor = JOptionPane.showInputDialog("Digite um número: ");
		
		Double valorCon = Double.parseDouble(valor);
		
		Double valorQuad = Math.pow(valorCon, 2);
		Double valorCub = Math.pow(valorCon, 3);
		
		
		JOptionPane.showMessageDialog(null, "Valor ao quadrado: " + valorQuad + "\n" + "Valor ao cubo: " + valorCub);
		
		

	}

}
