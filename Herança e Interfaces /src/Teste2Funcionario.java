 
public class Teste2Funcionario { 
	
	private String nome;
    private String cpf;
    private double salario;
    private int tipo = 0;    // Funcionário Comum = 0 ; Gerente = 1 ; Diretor = 2 
    private int senha ; 
    
    public boolean autentica (int senha) {
       
    	  if(this.senha == senha) {
    		  return true;
    	  } else { 
    		  return false;
    	  }
    		   
    	  }

    public double getBonificacao() {
    	
    	if (this.tipo == 0 ) { // Funcionario Comum 
    		return this.salario * 0.1 ; 
    		
    	}  else if (this.tipo == 1 ) { // Gerente 
    				
    		return this.salario; 
    		
    	}  else { //Diretor 
    	
    		return this.salario + 3000.5; 
    	}
        
    }
    
    public void setTipo(int tipo) {
		this.tipo = tipo;
	}
    
   public int getTipo() {
	return tipo;
} 
   
   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
	
	

}
