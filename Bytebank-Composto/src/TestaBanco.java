
public class TestaBanco {
 public static void main(String[] args) {
	Cliente paulo = new Cliente();
	paulo.nome = "Paulo Silveira";
    paulo.cpf = "123.456.789-00";
    paulo.profissao = "programador";
    
    Conta contaDoPaulo = new Conta();
    contaDoPaulo.deposita(100); 
    
    contaDoPaulo.titular = paulo;
    System.out.println(contaDoPaulo.titular.nome);
    
    System.out.println(contaDoPaulo.titular);
    System.out.println(paulo);
    
    
}
}