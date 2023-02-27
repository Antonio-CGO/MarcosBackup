import java.util.ArrayList;
import java.util.Scanner;
public class Hotel{
	private static int opcao;
		public static void main(String[] args) {
			
			
		
		
		System.out.println("");
		System.out.println("§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§");
		System.out.println("§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§");
		System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬ *. SEJA BEM VINDO .* ¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
		System.out.println("------------------ *o* HOTEL HOSPÍCIO *o* --------------------");
		System.out.println("§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§");
		System.out.println("§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§");
		System.out.println("");
		
		Quartos novoQuarto = new Quartos();
        Scanner sc = new Scanner(System.in);
		
		ArrayList <Quartos> Hospedes = new ArrayList();
		
		do{                           
			
			System.out.println("-------------------------------");
			System.out.println("============= MENU ============");
            System.out.println("");
			System.out.println("[1] Cadastrar dados do Hóspede");
			System.out.println("[2] Escolher quarto para o Hóspede");
			System.out.println("[3] Listar Hóspedes no Hotel");
			System.out.println("[4] Fazer Checkout do Hóspede");
			System.out.println("[0] Sair");
			System.out.println();
			System.out.println("Digite a opção desejada: ");
			opcao = sc.nextInt();
			sc.nextLine();
			
			switch (opcao) {	
			case 1: { 
			
			System.out.println();
			
			System.out.println("=====================CADASTRO DE CLIENTE======================");
			 			
			Hospede hospede = new Hospede();
			
			System.out.println("Digite o nome completo do Cliente: ");
			System.out.println();
			
          int n = 0;
          while (n < 1) {
			
			String nome = sc.nextLine();
			String regex = "^[A-Z][a-z]{1,}\\s+[A-Z][a-z]{1,}$";

			boolean nomeValido = nome.matches(regex);
			if(nomeValido == true) {
				hospede.setNome(nome);
				 n++;
			} else {
				System.out.println("Caracter Inválido, Digite um Nome Correto! EX: Aaa Bbb Ccc Ddd");
			}
			break;
			
			}
            
			DataCalendario data = new DataCalendario();
			data.datadenascimento();
		

			int numero = 0;
			
			while(numero < 1) {
				System.out.println("Digite o CPF completo do Cliente: ");

			    Hospede hospedes = new Hospede();
			    		
			    String cpf = sc.nextLine();
			    
			    String regx = "^[^a-zA-Z#@][0-9]{3}\\[0-9]{3}\\[0-9]{3}\\[0-9]{2}+$";
				boolean cpfEhValido = cpf.matches(regx);
				if(cpfEhValido == true) {
					System.out.println("CPF Válido!  ");
					hospede.setCpf(cpf);
					
				} else {
					System.out.println("CPF INVÁLIDO! DIGITE UM CPF CORRETO!");	
				}				
				
			}
 
			
			
			
			
			System.out.println("Digite o endereço do Cliente: ");
			String endereco =  sc.nextLine();
			 
		//	String cadastrar =  ("Adicionar cadastro (S/N) ?");
		//	if (cadastrar.equalsIgnoreCase("s")) {
				System.out.println("Cadastro adicionado !!!");
				
		//	} else if (cadastrar.equalsIgnoreCase("n")){
			//	System.out.println("Cadastro ignorado !!!");
		//	} else {
			
			
			
			Quartos.add(hospede);
			System.out.println("Hóspede Cadastrado!!");
			
			novoQuarto.insereHospede(hospede);
			break;
			}
			
			
			case 2: {
			System.out.println("======== ESCOLHER QUARTO ========");
			
			System.out.println("Qual quarto para o cliente ? : ");
			
			Quartos.validaQuarto();
			break;
			
			}
			
			case 3: {
			
			System.out.println("========= CLIENTES HOSPEDADOS ==========");
		
				novoQuarto.listarHospede();
				int referencia = sc.nextInt();
				sc.nextLine();
				break;
				
				
			}
		
			case 4: {
		    System.out.println("======== FAZER CHECKOUT ===========");
		    int referencia = sc.nextInt();
			sc.nextLine();
		    novoQuarto.listarHospede();
		    
		    
			
			
			break;
			
			
			}
		
			
				
			case 0: {
			System.out.println("========= SAIR ============");
			 System.out.println(" SAINDO...");
			 
			 Horacerta.certahora();
			  
			 Atualdatahora.dataehoraexata();
			 
			}
			
			default:
				System.out.println("Opção inválida, digite a opção correta seu IMBECIL!!!!!! ");
			}
		
			
		}while(opcao >0); 
        
		}
		
		

        
        }

    
    
    
    
    
    


