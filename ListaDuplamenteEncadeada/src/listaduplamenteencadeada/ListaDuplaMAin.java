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
public class ListaDuplaMAin {
    
    public static void main(String[] args) {
        ListaDupla le = new ListaDupla();
        
        le.inserirNoInicio(2);
        le.inserirNoFim(4);
        
         No aux =  le.getInicio();
          while(aux != null){
                 if(aux.getElemento().equals(2) && aux.getProximo().getElemento().equals(4)){
                      le.inserir(3, aux, aux.getProximo());
                        break;
                 }
                 aux = aux.getProximo();
    }
          
            aux = le.getInicio();
             while(aux != null){
                 System.out.println(aux.getElemento());
                  aux =  aux.getProximo();
             }
         
         
     
    }
    
}
