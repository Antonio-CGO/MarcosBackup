import java.util.Scanner;

public class Usuário {
	  
	public static void main (String[] args) {
	Scanner ler = new Scanner(System.in);
	double a;
    double b;
	
	
	System.out.println("Digite o primeiro número!");
	a = ler.nextDouble();
	
	System.out.println("Digite o segundo número!");
	b = ler.nextDouble();
	
	double total = a + b;
	
	
	System.out.println("O resultado é " + total);
   
	
	}
    }