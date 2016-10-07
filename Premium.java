
public class Premium extends Pacote
{
     public String getPasseiosPremium(){
        return "Fortaleza, Porto Alegre, Salvador, Manaus";
    
    
    }
 
    public double getValorTarifa(){
       double valorHospedagem = 0;
       double valorPasseio = 0;
       double valorSemTarifa = 0;
        
        if (this.getClasseDisponivel().toLowerCase().equals ("premium")&&(getQtdPessPremium() <= getMaximoPessoa()) ){
                valorHospedagem = 100;
                valorPasseio = 80;
               
                valorSemTarifa = this.getViagem().getValorTotal() + valorPasseio + valorHospedagem; 
                setQtdPessPremium(getQtdPessPremium() + 1);
                return  valorSemTarifa + ( valorSemTarifa * 0.30);


            }

            return 0;
            
      }
    
    
}
