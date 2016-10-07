import java.util.ArrayList;
import java.util.Scanner;
public class Principal
{    
    public static void escreva(String txt){
        System.out.print(txt);
    
    }   
    
    
    
    public static void menu(){
        System.out.println("\n");
        System.out.println(" ----------------------------------------------------------------------------------------- ");
        System.out.println("    Agencia de Turismo X ");
        System.out.println("## 1 - Cadastrar Passageiro: ");
        System.out.println("## 2 - Cadastrar Pacote de Viajem: ");            
        System.out.println("## 3 - Consultar quantidade vendidas prlo Pacote Premium: ");
        System.out.println("## 4 - Consultar quantidade vendidas prlo Pacote Executiva: ");
        System.out.println("## 5 - Consultar quantidade vendidas prlo Pacote Economica: ");
        System.out.println("## 6 - Consultar valor arrecadado: ");
        System.out.println("## 7-  Consultar numeros de pessoas atendidas:  ");
        System.out.println("## 0 - Sair");
        System.out.println(" ----------------------------------------------------------------------------------------- ");
        
    }
    
      public static void main(String args[]){
    
        Scanner leia = new Scanner(System.in);
        int sair = -1;
        
       
        TipoDePacote tipoP = new TipoDePacote();
        
        ArrayList<String> p = new ArrayList<String>;
      
        
       
         
  
        
        
        
        while(sair != 0){
            menu();
            sair = leia.nextInt();
            
            if (sair == 1){
             
             for (int i = 0; i < p.size() ; i++){
                
                escreva("  ----  CADASTRO DE PASSAGEIROS ---- \n ");
                
                escreva("Digite o nome do passageiro: ");pass.setNomePassageiro(leia.next());
                escreva("Digite o CPF do passageiro: ");pass.setCpf(leia.next());
                escreva("Digite o endereço do passageiro: ");pass.setEnd(leia.next());
                escreva("Digite o e-mail do passageiro: ");pass.setEmail(leia.next());
                escreva("Digite o telefone do passageiro: ");pass.setTel(leia.next());
        
                
        
                        
            }
                
                
                
                
            }else if (sair == 2){
            /*
                escreva("  ----  CADASTRO DE PACOTES ---- \n ");
                
                escreva("Digite o nome do pacote: ");p.setNomePassageiro(leia.next());
                escreva("Digite o CPF do passageiro: ");p.setCpf(leia.next());
                escreva("Digite o endereço do passageiro: ");p.setEnd(leia.next());
                escreva("Digite o e-mail do passageiro: ");p.setEmail(leia.next());
                escreva("Digite o telefone do passageiro: ");p.setTel(leia.next());
                */
               
             
            }else if (sair == 3){
              
            }
        }        
    }
}
