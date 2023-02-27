package bytebank;
          // DEPOSITAR NA CONTA ESPECÍFICA 
public class TestaMetodoBytebank {
		  public static void main(String[] args) {
			  
			  // CONTA NOVA CRIADA 
			  
			Conta contaDoPaulo = new Conta();
		    contaDoPaulo.saldo = 100;
		    contaDoPaulo.deposita(50);
		    System.out.println(contaDoPaulo.saldo);
		   
		    // SACAR // RETIRAR DE UMA CONTA ESPECÍFICA 
		    boolean conseguiuRetirar = contaDoPaulo.saca(20);
	        System.out.println(contaDoPaulo.saldo);
	        System.out.println(conseguiuRetirar);
	         
	        // CONTA NOVA CRIADA 
	        
	        Conta contaDaMarcela = new Conta();
	        contaDaMarcela.deposita(1000);
	        
	        //  TRASNFERENCIA DE VALOR DE UMA CONTA PARA OUTRA COM OU SEM SUCESSO 

	        boolean sucessoTransferencia = contaDaMarcela.transfere(300, contaDoPaulo);
	        if(sucessoTransferencia) {
	            System.out.println("transferencia com sucesso");
	        } else {
	            System.out.println("faltou dinheiro");

	        }
	        
	        // SALDO DAS CONTAS 
	        System.out.println(contaDaMarcela.saldo);
	        System.out.println(contaDoPaulo.saldo); 
	    }
	    }
