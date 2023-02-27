
  // Classe mãe , Base Class ou Super Class 

//Modificador de visibilidade ''protected'' a variável 
//fica entre o public e o private, serve para somente se tornar á público a classe Filha 

public abstract class Funcionario { // abstract = abstrado, ou seja para a classe mae, 
	
	                                // não ser mais algo concreto e sim os filhos, pois funcionário não é específico é abstrato
	
	                               

	
	
	
    private String nome;
    private String cpf;
    private double salario;
    //protected double salario;

    public double getBonificacao() {
        return this.salario * 0.05;
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
    