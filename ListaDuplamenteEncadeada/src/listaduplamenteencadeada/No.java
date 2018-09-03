
package listaduplamenteencadeada;

public class No<T> {

    private T elemento;
    private No anterior;
    private No proximo;
    
    public No(T elemento){
     this.elemento = elemento;
     this.anterior = null;
     this.proximo = null;
}
    
    public void setAnterior(No anterior){
        this.anterior = anterior;
    }
    
    public void setProximo(No proximo){
        this.proximo = proximo;
    }
    
    public T getElemento(){
        return elemento;    
    }
    
    public No getAnterior(){
        return anterior;
    }
    
    public No getProximo(){
        return proximo;
    }
}
