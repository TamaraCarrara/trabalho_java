

public class Executiva extends Pacote
{

     public String getPasseiosExecutivo(){
        return "Fortaleza, Porto Alegre, Salvador";
    
    
    }
    
   
    public double getValorTarifa(){
       double valorHospedagem = 0;
       double valorPasseio = 0;
       double valorSemTarifa = 0;
        
        if (this.getClasseDisponivel().toLowerCase().equals ("executiva")&&(getQtdPessExecutiva() <= getMaximoPessoa()) ){
                valorHospedagem = 80;
                valorPasseio = 50;
               
                valorSemTarifa = this.getViagem().getValorTotal() + valorPasseio + valorHospedagem; 
                setQtdPessExecutiva(getQtdPessExecutiva() + 1);
                return  valorSemTarifa + ( valorSemTarifa * 0.20);
                
            
            
            
        }
        return 0;
    
    }
      
    
            }

            
            
        