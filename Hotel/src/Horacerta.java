import java.util.Calendar;

public class Horacerta {
public static void main(String[] args) {
	

	certahora();
}

public static void certahora() {
	Calendar agora = Calendar.getInstance();
	int hora = agora.get(Calendar.HOUR_OF_DAY);
	 
	 if (hora > 6 && hora <12) {
		 System.out.println("BOM DIA!!!!");
		 
	 } else if (hora > 12 && hora < 18) { 
	System.out.println("BOA TARDE!!!!");
	
	 } else {
		 System.out.println("BOA NOITE !!!!!");
	 }
} 
}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
