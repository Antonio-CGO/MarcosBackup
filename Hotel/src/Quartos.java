
import java.util.ArrayList;
import java.util.Scanner;

public class Quartos {
	
	static Scanner sc = new Scanner(System.in);

public static void validaQuarto() {
    int quarto = sc.nextInt();
	if (quarto >= 201 && quarto <= 204) {
		System.out.println("Quarto cadastrado com sucesso!!!!");	
}else if (quarto >= 301 && quarto <= 304 ) {

System.out.println("Quarto cadastrado com sucesso!!!!");

 } else {
		System.out.println("Quarto inexistente");
 
	}
}


ArrayList<Hospede> listadehospedes;
public Quartos() {
this.listadehospedes = new ArrayList<>();

}
void insereHospede (Hospede novoHospede) {
	
	listadehospedes.add(novoHospede);
}

void listarHospede() {
System.out.println("Lista de Hóspedes: ");

 mostrarhospedes();
}

private void mostrarhospedes() {
	for(Hospede hospedeNaLista: listadehospedes) {
	    hospedeNaLista.listar();
	}
}

public static void add(Hospede novoHospede) {
}
}	

	






