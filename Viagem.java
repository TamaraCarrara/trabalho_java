

public class Viagem
{
    private String origem, destino, dataDisponivel, horaDaPartida;
    private double valorIda, valorVolta;
    
  
    
    public Viagem(){

    }
    
    public Viagem(String origem, String destino, String dataDisponivel, String horaDaPartida, double valorIda, 
    double valorVolta){
        this.origem = origem;
        this.destino = destino;
        this.dataDisponivel = dataDisponivel;
        this.horaDaPartida = horaDaPartida;
        this.valorIda = valorIda;
        this.valorVolta = valorVolta;
               
    }
   
    //valor total das passagens
    public double getValorTotal(){
         return getValorIda() + getValorVolta();
         }
        
    public void setValorIda(double valorIda){
        this.valorIda = valorIda;
      }
    public double getValorIda(){
        return valorIda;
     }
     
    public void setValorVolta(double valorVolta){
        this.valorVolta = valorVolta;
      }
    public double getValorVolta(){
        return this.valorVolta;
     }
    
    public void setOrigem(String origem){
        this.origem = origem;
      }
    public String getOrigem(){
        return origem;
     }
    
    public void setDestino(String destino){
        this.destino = destino;
      }
    public String getDestino(){
        return destino;
     }
    
    public void setDataDisponivel(String dataDisponivel){
        this.dataDisponivel = dataDisponivel;
      }
    public String getDataDisponivel(){
        return dataDisponivel;
     }
     
    public void setHoraDaPartida(String horaDaPartida){
        this.horaDaPartida = horaDaPartida;
      }
    public String gethoraDaPartida(){
        return horaDaPartida;
     } 
    
    
    
    
    
    
}
