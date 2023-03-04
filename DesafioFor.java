package desafios;

public class DesafioFor {

	public static void main(String[] args) {
		
		String valor = "#";
		
		for(int i = 1; i <= 5; i++ ) {
			
			System.out.println(valor);
			valor += "#";
			
			
		}
		
		
		// Versão sem usar valor númerico 
		
		for(String v = "#"; !v.equals("######");v += "#") {
			
			
			System.out.println(v);
			
			
			
		}
		
		
		
		

	}

}
