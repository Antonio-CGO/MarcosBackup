
public class TesteFuncionário { 
	
public static void main(String[] args) {
	
	//Funcionario  
	Gerente Marcos = new Gerente();
	
	Marcos.setNome("Marcos Ramos");
	
	Marcos.setCpf("123.456.789-00");
	
	Marcos.setSalario(3000.0);

	System.out.println(Marcos.getNome());
	System.out.println(Marcos.getBonificacao());
	
	
			
}
}
