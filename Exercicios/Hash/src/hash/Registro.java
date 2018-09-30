package hash;


public class Registro {
   private int chave;
   private String valor;
   
   public Registro(int chave, String valor){
       this.chave = chave;
       this.valor = valor;
   }
   
   public Registro(){
       //
   }
     
     public void setChave(int chave){
        this.chave = chave;
    }
     
     public void setValor(String valor){
        this.valor = valor; 
     }
     
     public int getChave(){
         return this.chave;
     }
     
     public String getValor(){
         return this.valor;
     }
     
     public int hashCode(){
         return chave % 100;
     }
     
     
}
