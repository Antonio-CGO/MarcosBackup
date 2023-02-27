
public class TesteReferencias {
 
	public static void main(String[] args) {
	
	 Gerente g1 = new Gerente();
//ou Funcionario g1 , Ambos se torna um objeto. 
	 
	 g1.setNome("Marcos");
	 g1.setSalario(7000.0);
	 
	 //Funcionario se torna um objeto
	 
// Ou Diretor d Se torna um Objeto 
	Funcionario d = new Diretor();
	 d.setSalario(12000.0);
	 
	 
	ControleBonificacao controle = new ControleBonificacao();

    controle.registra(g1);
    controle.registra(d);
    System.out.println(controle.getSoma());
    
    
 
 
 
 }
 
 
 
 
}
