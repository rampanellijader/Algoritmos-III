/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

/**
 *
 * @author Jader
 */
public class CustoAresta {
    
    int verticeA;
    int verticeB;
    int custo;

    public CustoAresta(int u, int v, int custo) {
        
        this.verticeA = u;
        this.verticeB = v;
        this.custo = custo;
    
    }
    
}
