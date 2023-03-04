package desafios;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class DesafioIMC {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String alt = JOptionPane.showInputDialog("Digite sua altura: ");
		String pe = JOptionPane.showInputDialog("Digite seu peso: ");

		Double altd = Double.parseDouble(alt);
		Double ped = Double.parseDouble(pe);

		Double IMC = ped / Math.pow(altd, 2);
	
		
		JOptionPane.showMessageDialog(null, "O seu Índice de Massa Corporal (IMC) ficou em  " + String.format("%.2f", IMC));

	}

}
