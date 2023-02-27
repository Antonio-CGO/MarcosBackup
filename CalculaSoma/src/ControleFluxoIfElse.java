
public class ControleFluxoIfElse {

	public static void main(String[] args) {
		
		// idade < 15 categoria infantil
	   // idade >= 15 && idade < 18 juvenil 
      // idade >= 18 adulto
		
		int idade = 18;
		
		if (idade < 15) {
			System.out.println("Categoria Infantil");
			}else if (idade>=15 && idade < 18 ) {
		System.out.println("Categoria Juvenil");
			}else{ 
				System.out.println("Categoria Adulto");
			}


	
	}

} 
