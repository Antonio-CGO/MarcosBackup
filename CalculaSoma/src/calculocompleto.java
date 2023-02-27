import java.util.Scanner;

public class calculocompleto {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		double a;
		double b;
		
		System.out.println("Infome o primeiro número:");
	    a = ler.nextDouble();
	    
	    System.out.println("Informe o segundo número:");
	    b = ler.nextDouble();
	    
	    double adiçao = a + b;
	    double subtraçao = a - b;
	    double multiplicaçao = a * b;
	    int divisao = (int) (a/b);
	    double divisaoexata = a/b;
	    double porcentagem = a%b;
	    

	    	
	     System.out.println("Os resultados para estes números são!!! ");
	     System.out.println("Soma: "+ adiçao);
	     System.out.println("Subtração : " + subtraçao);
	     System.out.println("Multiplicado : " +multiplicaçao);
	     System.out.println("Divsão Inteira : " + divisao);
	     System.out.println("Divisão Exata : " +divisaoexata);
	     System.out.println("Porcentagem : " +porcentagem);
	      
	     System.out.println("FIM ");
	   
	     


	
}
}