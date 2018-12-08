/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Jader
 */
public class Main {
    
    public static void main(String[] args) throws IOException {

		Funcoes of = new Funcoes();

		/**
		 * Ler a entrada do arquivo
		 */

		
		BufferedReader br = new BufferedReader(new FileReader("src/Grafo.txt"));
		
		
		String linha = null;
		of.analisarEntradaPrimeiraLinha(br.readLine());		// ler a primeira linha para definir a no de nós, arestas e nó raiz
		while( (linha = br.readLine()) != null)
			of.addAOGrafo(linha);
		br.close();

		of.ExecFunc();

	}

}
    

