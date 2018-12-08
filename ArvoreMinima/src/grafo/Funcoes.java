/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafo;

/**
 *
 * @author Jader
 */
public class Funcoes {

	public Grafo raiz;
	public No noRaiz;

	/**
	 * Construtor Ṕadrão
	 */
	public Funcoes() {
		raiz = new Grafo();
		noRaiz = null;
	}

	/**
	 * Analisa a primeira linha de entrada
	 * @param linha
	 */
	public void analisarEntradaPrimeiraLinha(String linha) {
		String splitStr[] = linha.split("\\s+");
		raiz.noDosNodos = Integer.parseInt(splitStr[0]);
		raiz.noDasArestas = Integer.parseInt(splitStr[1]);
	}

	/**
	 * Analisar as linhas restantes da entrada
	 * @param str
	 */
	public void addAOGrafo(String str) {
		String splitStr[] = str.trim().split("\\s+");

		No a, b;
		Integer id1 = Integer.parseInt(splitStr[0]);
		Integer id2 = Integer.parseInt(splitStr[1]);
		if(raiz.nodosHashMap.containsKey(id1)) {
			a = raiz.nodosHashMap.get(id1);
		} else {
			a = new No(id1);
		}
		if(raiz.nodosHashMap.containsKey(id2)) {
			b = raiz.nodosHashMap.get(id2);
		} else {
			b = new No(id2);
		}

		if(noRaiz == null) {
			noRaiz = a;
		}
                // add Nó e Aresta (mostra no console)
		raiz.addNoEAresta(a,b, Integer.parseInt(splitStr[2]));	
	}

	public Double Custo(Double custo){
		for(Aresta aresta : raiz.mstArvArestasList) {
			 custo+= aresta.peso;
		}
		return custo;
	}
	
	public void ExecFunc() {

		 // 1) Algoritmo de Kruskal para encontrar a MST
		 
		Integer custo =0;
		raiz.Kruskal();	 // mstTree contêm as arestas da arv MST
		System.out.println("---------------------------------------------------------------------------------------------------------");
		System.out.println("\nArestas na Arv. MST por Algoritmo de  Kruskal :");
		for(Aresta aresta : raiz.mstArvArestasList) {
			System.out.println("(" + aresta.a.id + "," + aresta.b.id + ") = " + aresta.peso);
			custo = custo + aresta.peso;
		}
		System.out.println("\n---------------------------------------------------------------------------------------------------------");
		System.out.println("Custo :"+ custo);
		System.out.println("---------------------------------------------------------------------------------------------------------");
		
	}
}
    

