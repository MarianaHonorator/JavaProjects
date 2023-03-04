package desafios.desafioClasses;

import java.util.Scanner;

public class Jantar {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	

System.out.print("Digite seu nome: ");
String x = sc.next();
		
System.out.print("Digite seu peso(kg):" );
double y = sc.nextDouble();
		

System.out.print("Digite o que vai comer: ");
String z = sc.next();

System.out.print("Digite o peso da comida(g): ");
double w = sc.nextDouble();

		
		Pessoa p1 = new Pessoa(x,y);
		
		Comida c1 = new Comida(z,w);
		
		 p1.comer(c1);
		
		System.out.println(x + " comeu " + z + " e agora pesa " + p1.peso + "Kg");
		
		sc.close();
	}
}
 