
import java.util.ArrayList;
public class AgenciaTurismo 
{
    private String nomeAgencia, cnpj, end, email, tel;
    ArrayList<Pacote> pacotes;
    
    
    public AgenciaTurismo(){
   
    }
    
    public AgenciaTurismo(String end,  String email, String tel,String nomeAgencia, String cnpj,  ArrayList<Pacote> pacotes ){
     this.end = end;
     this.email = email;
     this.tel = tel; 
     this.nomeAgencia = nomeAgencia;
     this.cnpj = cnpj;
     this.pacotes = pacotes;
     }
     
    public void setEnd(String end){
        this.end = end;
    }
    public String getEnd(){
        return end;
    }
        
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
        
    public void setTel(String tel){
        this.tel = tel;
    }
    public String getTel(){
        return tel;
    } 
     
     
    public void setNomeAgenica(String nomeAgencia){
        this.nomeAgencia = nomeAgencia;
    }
    public String getNomeAgencia(){
        return nomeAgencia;
    }
    
    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }
    public String getCnpj(){
        return cnpj;
    }
    
     public void setPacotes(ArrayList<Pacote> pacotes){
        this.pacotes = pacotes;
    }
    public ArrayList<Pacote> getPacotes(){
        return pacotes;
    }
    
    // verificando as qtds dos pacotes percorrendo o array de cada classe
    public int getQtdVendidaEconomica(){
        int qtd = 0;
        for(Pacote p: this.getPacotes()){
            if (p.getClasseDisponivel().toLowerCase().equals("economica")){
                
                qtd++;
            }
        }
        return qtd;
    }
    
     public int getQtdVendidaExecutiva(){
        int qtd = 0;
        for(Pacote p: this.getPacotes()){
            if (p.getClasseDisponivel().toLowerCase().equals("executiva")){
                
                qtd++;
            }
        }
        return qtd;
    }
    
    public int getQtdVendidaPremium(){
        int qtd = 0;
        for(Pacote p: this.getPacotes()){
            if (p.getClasseDisponivel().toLowerCase().equals("premium")){
                
                qtd++;
            }
        }
        return qtd;
    }
  
    //valor total arrecadado
     public double getValorArrecadado(){
        double valor = 0;
        for(Pacote p: this.getPacotes()){
            valor += p.getValorTarifa();
        }
        return valor;
    }
   
    //numero pessoas atendidas
    public int getTotalPessAtendidas(){
        int qtd = 0;
        for(Pacote p: this.getPacotes()){
            qtd += (p.getQtdPessEconomica() + p.getQtdPessExecutiva() +   p.getQtdPessPremium());
        }
        return qtd;
      
        
    }
    
    
    
    
    
    
}
