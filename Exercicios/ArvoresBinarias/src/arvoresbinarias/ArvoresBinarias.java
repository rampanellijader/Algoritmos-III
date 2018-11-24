/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvoresbinarias;


public class ArvoresBinarias {

    
    public static void main(String[] args) {
       Arvore arvore = new Arvore(new Elemento(10));
       
       arvore.inserir(new Elemento(5));
       arvore.inserir(new Elemento(1));
       arvore.inserir(new Elemento(8));
    }
    
}
