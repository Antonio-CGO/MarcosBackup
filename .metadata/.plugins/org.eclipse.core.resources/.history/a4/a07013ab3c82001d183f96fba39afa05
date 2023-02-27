
// CLASSE CONTA 
class Conta {
    private double saldo;
    int agencia;
    int numero;
   Cliente titular; 
     
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
                	return false; }
                }
                
               
               public double getSaldo() {
            	   return this.saldo;
            	   
               }
                  
                }
                

		
    
