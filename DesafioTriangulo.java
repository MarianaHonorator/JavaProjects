package desafios;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class DesafioTriangulo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String val1 = JOptionPane.showInputDialog("Digite a base do triângulo: ");
		String val2 = JOptionPane.showInputDialog("Digite a altura do triângulo: ");
		
		
		Double base = Double.parseDouble(val1);
		Double altura = Double.parseDouble(val2);
		
		Double area = (base * altura)/2;
		
		JOptionPane.showMessageDialog(null, "A área do trângulo é " + area + "m²");
	
	}

}
