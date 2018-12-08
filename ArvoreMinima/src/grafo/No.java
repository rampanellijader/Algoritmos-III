/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafo;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Jader
 */
public class No {

	public Integer id;
	public List<Aresta> listaArestasAdj;

	public No mstPai;
	public int rank;
	public List<Aresta> mstAresta;
	public double L;


	public No(Integer id) {
		this.id = id;
		listaArestasAdj = new LinkedList<>();
		mstPai = null;
		rank = 0;
		mstAresta = new LinkedList<Aresta>();
		L = 0;
	}

	/**
	 * add a aresta
	 * @param adj
	 */
	public void addNoAdj(Aresta adj) {
		this.listaArestasAdj.add(adj);
	}
}