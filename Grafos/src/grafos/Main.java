
package grafos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jader
 */
public class Main {
    public static void main(String[] args) {
        
    //ler arquivo
        String nomeArquivo = "src/Grafo.txt";
        
     
    //Criar arquivo
    Grafos g;
        try{
            g = new Grafos(nomeArquivo);
            System.out.println(g); //mostra o arquivo
        
        }catch(Exception e){
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, e);
        }
        System.out.println("Que distância quer ver?");
     
     
        
    }
}
