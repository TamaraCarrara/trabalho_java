

public class Pacote
{
    private String classeDisponivel;
    private Viagem viagem;
    private int maximoPessoa, qtdPessEconomica,qtdPessExecutiva, qtdPessPremium ;
    
           
    
    public Pacote(){
     
       }
    public Pacote(String classeDisponivel){
        this.classeDisponivel = classeDisponivel;
                
    }   

    public void setClasseDisponivel(String classeDisponivel){
         this.classeDisponivel = classeDisponivel;
    }
    public String getClasseDisponivel(){
        return classeDisponivel;
    }
    
     public void setViagem(Viagem viagem){
         this.viagem = viagem;
    }
    public Viagem getViagem(){
        return viagem;
    }
    
       
    public int getMaximoPessoa(){
        return 10;
    }
   
        
    public void setQtdPessEconomica(int qtdPessEconomica){
         this.qtdPessEconomica = qtdPessEconomica;
    }
    public int getQtdPessEconomica(){
        return qtdPessEconomica;
    }
    
      public void setQtdPessExecutiva(int qtdPessExecutiva){
         this.qtdPessExecutiva = qtdPessExecutiva;
    }
    public int getQtdPessExecutiva(){
        return qtdPessExecutiva;
    } 
    
    public void setQtdPessPremium(int qtdPessPremium){
         this.qtdPessPremium = qtdPessExecutiva;
    }
    public int getQtdPessPremium(){
        return qtdPessPremium;
    } 
   
    
    /* classes dos pacotes  
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
            
        
            }else if (this.getClasseDisponivel().toLowerCase().equals ("executiva")&&(getQtdPessExecutiva() <= getMaximoPessoa()) ){
                valorHospedagem = 80;
                valorPasseio = 50;
               
                valorSemTarifa = this.getViagem().getValorTotal() + valorPasseio + valorHospedagem; 
                setQtdPessExecutiva(getQtdPessExecutiva() + 1);
                return  valorSemTarifa + ( valorSemTarifa * 0.20);
                
            }else if (this.getClasseDisponivel().toLowerCase().equals ("premium")&&(getQtdPessPremium() <= getMaximoPessoa()) ){
                valorHospedagem = 100;
                valorPasseio = 80;
               
                valorSemTarifa = this.getViagem().getValorTotal() + valorPasseio + valorHospedagem; 
                setQtdPessPremium(getQtdPessPremium() + 1);
                return  valorSemTarifa + ( valorSemTarifa * 0.30);


            }

            return 0;
            
      }*/
        
    
    
    
    
    
    }
