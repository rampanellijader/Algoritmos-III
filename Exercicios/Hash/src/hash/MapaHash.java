package hash;


public class MapaHash {
    private Registro valores[];
   
    
    public MapaHash(){
        valores = new Registro[100];
    }
    
    public void put(Registro registro){
        int posicao = registro.hashCode();
        if(valores[posicao]==null){
            valores[posicao] = registro;
        }
        
    }
    
    public Registro get( int chave){
        Registro r = new Registro();
        r.setChave(chave);
        int posicao = r.hashCode();
               
        return valores[posicao];
    }
}
