
package arvoresbinarias;


public class Arvore {
    private Elemento elemento;
    private Arvore direita;
    private Arvore esquerda;
    
    
      public Arvore(){
          this.elemento = null;
          this.direita = null;
          this.esquerda = null;
      }
      
      public Arvore(Elemento elemento){
          this.elemento = elemento;
          this.direita = null;
          this.esquerda = null;
       }
      
      
      //métodos de controle
      
      public boolean isEmpty(){
          return (this.elemento == null);
      }
      
      public void inserir(Elemento novo){
          if(isEmpty()){
              this.elemento = novo;
          }
          else {
              Arvore novaArvore = new Arvore(novo);
              if(novo.getValor() > this.elemento.getValor()){ //vou inserir no descendente a esquerda
                  if(this.esquerda == null){
                      this.esquerda = novaArvore;
                  }
               else{ 
                   this.esquerda.inserir(novo);
                  }
              }
              else if(novo.getValor() > this.elemento.getValor()){
                  if(this.direita == null){
                      this.direita = novaArvore;
                  }
                  
                  else{
                      this.direita.inserir(novo);
                  }
              
          }
          }
      }

    public Elemento getElemento() {
        return elemento;
    }

   
    public void setElemento(Elemento elemento) {
        this.elemento = elemento;
    }

   
    public Arvore getDireita() {
        return direita;
    }

   
    public void setDireita(Arvore direita) {
        this.direita = direita;
    }
    public Arvore getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(Arvore esquerda) {
        this.esquerda = esquerda;
    }
    
    
}
