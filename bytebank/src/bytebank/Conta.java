package bytebank;
// CLASSE CONTA 
class Conta { 
    double saldo;
    int agencia;
    int numero;
    String titular; 
     
    // DEPÓSITO NA CONTA 
    
    public void deposita(double valor) {
        this.saldo = this.saldo + valor; 
    	 }
    
    // SAQUE , SE PODE SER SACADO O VALOR X OU NÃO 
    public boolean saca(double valor) { 
        if(this.saldo >= valor) { 
            this.saldo -= valor; 
            return true;
        } else {
        	return false; 
        }
            
        }
         // TRANFERENCIA DE UMA CONTA PARA OUTRA 
           public boolean transfere(double valor, Conta destino) { 
                if(this.saldo >= valor) { 
                    this.saldo -= valor;
                    return true;
                } else {
                	return false; 
                }
                }     
    } 
