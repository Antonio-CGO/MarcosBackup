package bytebank;

public class testMetodos {

	public static void main(String[] args) {
		String nome= "Marcos";
		String nome2 = "Marcos";
		
		nome = nome2;
		
		boolean ehIgual = nome == nome2;
		
		if(ehIgual) {
			System.out.println("entrou no if");
		} else {
			System.out.println("entrou no else");
		}
		
		
	}
	
}
