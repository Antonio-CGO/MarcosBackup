 // Classe 	Filha 

//Gerente é um funcionário, então ele herda tudo da classe funcionário através do extends 

//''super'' é a variável usada para indicar que o atributo vem da Classe mãe. 

public class Gerente extends Funcionario{
  
	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
    
    public boolean autentica (int senha ) {
    	if(this.senha == senha) {
    		return true;
    	} else {
    		return false; 
    	}
    		
    	}
    		
    public double getBonificacao() {
    	System.out.println("Chamando o metodo de bonificacao do Gerente ");
    	return super.getSalario();
    			                        
   // Caso seja usada a variável protected-> ^ super.salario;
    }
    
    }
    
    	
    


