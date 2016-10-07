

public class Passageiro 
{
    private String nomePassageiro, cpf, hospedagem, end, email, tel;
    
    public Passageiro(){
        
     }
    
    public Passageiro(String end,  String email, String tel,String nomePassageiro, String cpf,String hospedagem){
     this.end = end;
     this.email = email;
     this.tel = tel; 
     this.nomePassageiro = nomePassageiro;
     this.cpf = cpf;
     this.hospedagem = hospedagem;
       
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
     
    public void setNomePassageiro(String nomePassageiro){
        this.nomePassageiro = nomePassageiro;
      }
    public String getNomePassageiro(){
        return nomePassageiro;
     }
           
    public void setCpf(String cpf){
        this.cpf = cpf;
     }
    public String getCpf(){
        return cpf;
     }
     
    public void setHospedagem(String hospedagem){
        this.hospedagem = hospedagem;
     }
    public String getHospedagem(){
        return hospedagem;
     } 
    

    
}
