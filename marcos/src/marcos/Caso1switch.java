package marcos;

public class Caso1switch {
public static void main(String[] args) {
	
    byte dia = 5;
    //char, byte, int, short, enum e String 
    switch (dia) {
    
    case 1: 
    	System.out.println("Domingo");
    	break;
    case 2:
    	System.out.println("Segunda");
    	break;
    case 3:
    	System.out.println("Terça");
    	break;
    case 4:
    	System.out.println("Quarta");
    break;
    case 5:
    	System.out.println("Quinta");
    	break;
    case 6:
    	System.out.println("Sexta");
    	break;
    case 7:
    	System.out.println("Sábado");
    	break;
     }
              // 'G' PARA OPÇÃO INVÁLIDA
     char sexo = 'F';  // Se for do tipo String, trocar para String "..."
     switch (sexo) {
     case 'F' :
    	 System.out.println("Feminino");
    	 break;
     case 'M' :
    	 System.out.println("Masculino");
     break;
     
     default: // default será executado caso alguma opção case não seja executada.
    	 System.out.println("Opção Inválida");
     break;
     }
     
}
}
