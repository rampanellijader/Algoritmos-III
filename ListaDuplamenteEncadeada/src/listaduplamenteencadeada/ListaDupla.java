/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaduplamenteencadeada;

/**
 *
 * @author Jader
 */
public class ListaDupla<T> {
    
    private No inicio;
    private No fim;
    private int tamanho;

    
    public No getInicio() {
        return inicio;
    }

    
    public void setInicio(No inicio) {
        this.inicio = inicio;
    }

   
    public No getFim() {
        return fim;
    }

    
    public void setFim(No fim) {
        this.fim = fim;
    }
    
    public ListaDupla(){
        this.inicio = this.fim =null ;
    }
    
    public boolean isEmpty(){
       return (this.getInicio() == null); 
    }
    
    public void inserirNoInicio(T elemento){
          No novo = new No(elemento);
            if(this.inicio == null){
                this.fim = novo;
          }
          else{ 
               novo.setProximo(this.inicio);
               this.inicio.setAnterior(novo);
              }
            this.inicio = novo;
          }          
        
     public void inserirNoFim(T elemento){
         No novo = new No(elemento);
          if(this.fim == null){
              this.inicio = novo;
          }else {
               novo.setAnterior(this.fim);
               this.fim.setProximo(novo);
          }
          this.fim = novo;
     }
     
     public void inserir(T elemento, No anterior, No proximo){
         No novo = new No(elemento);
         novo.setProximo(proximo);
         novo.setAnterior(anterior);
         anterior.setProximo(novo);
         proximo.setAnterior(novo);
     }
          
     public void removerNoInicio(){
         if(this.inicio == this.fim){
             this.inicio = this.fim = null;
         }else{
             this.inicio = this.inicio.getProximo();
             this.inicio.setProximo(null);
         }
          
     }
     public void removerNoFim(){
         if(this.inicio == this.fim){
             this.inicio = this.fim = null;
         }else{
             this.fim = this.fim.getAnterior();
             this.fim.setProximo(null);
         }         
     }
     
    public T get(int indice){
        No aux = this.inicio; 
       for(int i= 0; i <= indice; i++) {
         aux = aux.getProximo();
    } 
      return (T) aux.getElemento();
      
    } 
    
    public int tamanho(){
        return this.tamanho;
    }
    
    /*public void exibirNaOrdem(){
        No tmp;
        tmp = getInicio();
        do{
            System.out.println("Elemento da lista = "+tmp.getElemento());
            tmp = tmp.getProximo();
        }while(tmp != getInicio());
        
    }
    
    public void exibirNaOrdemInversa(){
        No tmp;
        tmp = getInicio();
        do{
            System.out.println("Elemento da lista = "+tmp.getElemento());
            tmp = tmp.getAnterior();
        }while(tmp != getInicio());
    } */

   
}
