
public class Economica extends Pacote
{
    
    
  public String getPasseiosEconomico(){
        return "Porto Alegre, Salvador";
    
    
    }
    
    
      public double getValorTarifa(){
       double valorHospedagem = 0;
       double valorPasseio = 0;
       double valorSemTarifa = 0;
        
       if (this.getClasseDisponivel().toLowerCase().equals ("economica")&&(getQtdPessEconomica() <= getMaximoPessoa()) ){
                
                valorHospedagem = 50;
                valorPasseio = 30;
               
                valorSemTarifa = this.getViagem().getValorTotal() + valorPasseio + valorHospedagem; 
                setQtdPessEconomica(getQtdPessEconomica() + 1);
                return  valorSemTarifa + ( valorSemTarifa * 0.10);
            
        
            }

            return 0;
     
    
    
    
       
        
        
   }
        }
