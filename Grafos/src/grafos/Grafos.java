
package grafos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class Grafos {
        
       private final int n;  //número de vértices
        
       private int m; //número de arestas
       private int[][] CustoAr;
       CustoAresta custo;
       ArrayList listCust = new ArrayList();
       
       //acha mais fácil a lista para cada vértice
       private HashMap<Integer,ArrayDeque<Integer>> adj;
       
       
       public Grafos(int n){
           if(n < 0){
               throw new IllegalArgumentException("O número de Vértices deve ser maior que Zero!");
           }
       
            this.n =n;
            this.m=0;
            this.adj=new HashMap<>();

           for(int i=0; i<n; i++){
            adj.put(i, new ArrayDeque<Integer>());
            }
      }
       
       public Grafos(String nomeArquivo) throws FileNotFoundException, Exception{
           //método para ler o arquivo selecionado
           this(new Scanner(new File(nomeArquivo))); //manda para o Grafo(Scanner in)
       }
       
       public Grafos(Scanner in) throws Exception{
           if(null == in){
              throw new IllegalArgumentException("Scanner deve estar Funcionando");
           }
           if (!in.hasNextInt()){
            throw new Exception("Primeiro número deve ser um inteiro");
        }
           n = in.nextInt(); //pega a primeira linha
           
           if(n < 0){
                throw new IllegalArgumentException("O número de Vértices deve ser maior do que Zero");
           }
           if (!in.hasNextInt()){
            throw new Exception("Segundo numero deve ser um numero inteiro");
           }
           
           int numArestas = in.nextInt();
           
           if (numArestas < 0){
               throw new IllegalArgumentException("O número de Arestas deve ser maior que zero");
             }
           
           adj = new HashMap<>();
           
           for(int i =0; i<n; i++){
               adj.put(i, new ArrayDeque<Integer>());
           }
           
           for(int i=0; i<n; i++){
               int u = in.nextInt();
               int v = in.nextInt();
               int custo = in.nextInt();
               
               CustoAresta Custo = new CustoAresta(u,v, custo);
               listCust.add(Custo);
               
               addAresta(u,v);
               
               if(in.hasNextLine())in.hasNextLine(); //próxima linha
           }
           
       }
       
       public Grafos(Grafos g){
           if(null == g){
               throw new IllegalArgumentException("O número de Vértices deve ser maior do que Zero");
           }
           this.n = g.n();
           this.m = g.m();
           
           for(int i = 0; i < this.n; i++){
               adj.put(i, g.adj.get(i).clone());
           }
       }
       
       public int n(){
           return n; //retorna o numero de vertices
       }
       public int m(){
           return m; //retorna o numero de arestas
       }
       
       
    //Verificar se os vértices estão dentro dos limites
        private boolean VerificaVertice(int u){
            return((u>=0)&&(u<n+1)) ;
       }
       
        public final void addAresta(int u, int v){
            if(!VerificaVertice(u)){
                throw new IndexOutOfBoundsException("Vértices de origem fora da faixa");
            }
            if(!VerificaVertice(v)){
                throw new IndexOutOfBoundsException("Vértices de origem fora da faixa");
            }
            m++; //add aresta na contagem
            
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        
        public final void addArestaDirecionada(int u, int v){
            if(!VerificaVertice(u)){ //vértice de origem
                throw new IndexOutOfBoundsException("Vértices de origem fora da faixa");
            }
            if(!VerificaVertice(v)){//vértice de destino
                throw new IndexOutOfBoundsException("Vértices de origem fora da faixa");
            }
            m++; //add aresta na contagem
            
            adj.get(u).add(v);
        }
        
        public Iterable<Integer> adj(int v){
            if(!VerificaVertice(v)){
                throw new IllegalArgumentException("Vértices de origem fora da faixa");
            }
            return adj.get(v);
        }
        
        public String toString(){
            StringBuilder s = new StringBuilder();
            
         //obtém o separador específico do sistema
            String SL = System.getProperty("line.separator");
            
            s.append(n).append(" Vertices ").append(m).append(" Arestas ").append(SL);
            
            for(int v = 0; v < n; v++){ //loop para gerar cada linha da vizinhança
                for(int u : adj(v)){
                    s.append(v).append("-").append(u).append(" ");
                }
                    
                s.append(SL);
            }
            return s.toString();
        }
        
}
    